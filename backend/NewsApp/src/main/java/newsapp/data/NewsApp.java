package newsapp.data;

import newsapp.services.data.SessionManager;
import org.hibernate.Query;
import org.orm.PersistentException;
import org.orm.PersistentSession;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class NewsApp extends SessionManager {

    /*
    private static String getSubstring(String s) {
        String sub = s.substring(0, s.length() - 1);
        return sub;
    }

    private static String normalizeDate(String s) {
        String[] f = s.split("T");
        String fsecond = getSubstring(f[1]);
        String firstString = f[0]+ " " + fsecond;
        return firstString;

        String fString = normalizeDate(o1);
        String sString = normalizeDate(o2);
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
              first = sdf.parse(fString);
              } catch (ParseException e ) {
                 e.printStackTrace();
              }
    }*/

    public static boolean isLiked(int article_id, int user_id) {
        Article article;
        User user;
        try {
            article = ArticleDAO.getArticleByORMID(article_id);
            user = UserDAO.getUserByORMID(user_id);
            if(user._likedArticles.contains(article)) {
                return true;
            }
        } catch(PersistentException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void like(int article_id, int user_id) {
        Article article;
        User user;
        try {
            article = ArticleDAO.getArticleByORMID(article_id);
            user = UserDAO.getUserByORMID(user_id);
            if(user._likedArticles.contains(article)) {
                user._likedArticles.remove(article);
                article.setLikes(article.getLikes() - 1);
            }
            else {
                user._likedArticles.add(article);
                article.setLikes(article.getLikes() + 1);
            }
            UserDAO.save(user);
            ArticleDAO.save(article);
        } catch(PersistentException e) {
            e.printStackTrace();
        }
    }

    public static Article getArticle(int id) {
        Article article = null;
        try {
            article = ArticleDAO.getArticleByORMID(id);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return article;
    }

    public static List<ChannelArticle> getCommentedArticles(List<Channel> channels, int token) {
        List<ChannelArticle> articles = new ArrayList<>();
        for(Channel c : channels) {
            Iterator it = c._articles.getIterator();
            while(it.hasNext()) {
                Article a = (Article) it.next();
                Iterator at  = a._comments.getIterator();
                while(it.hasNext()) {
                    Comment co = (Comment) it.next();
                    if(co.get_author().getID() == token) {
                        Channel channel = a.getChannel();
                        ChannelArticle ca = new ChannelArticle(a.getChannel().getName(), a);
                    }
                }
            }
        }
        return articles;
    }

    public static List<ChannelArticle> getLikedArticles(User u) {
        List<ChannelArticle> articles = new ArrayList<>();
        Iterator it = u._likedArticles.getIterator();
        while(it.hasNext()) {
            Article a = (Article) it.next();
            ChannelArticle ca = new ChannelArticle(a.getChannel().getName(), a);
        }
        return articles;
    }

    public static List<ChannelArticle> getArticles(List<Channel> channels) {
        List<ChannelArticle> articles = null;
        for(Channel c : channels) {
            Iterator ti = c._articles.getIterator();
            while (ti.hasNext()) {
                Article a = (Article) ti.next();
                ChannelArticle ca = new ChannelArticle(c.getName(), a);
                articles.add(ca);
            }
        }
        return articles;
    }

    public static List<Channel> getChannels() {
        String condition = "from Channel";
        List<Channel> l = null;
        try {
            PersistentSession session = ProjectEAPersistentManager.instance().getSession();
            Query query = session.createQuery(condition);
            l = query.list();
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return l;
    }

    public static List<Channel> getUserSubscriptionChannels(int token) {
        User u = getUser(token);
        List<Channel> channels = new ArrayList<>();
        Iterator ts = u._subscriptions.getIterator();
        while (ts.hasNext()) {
            Channel channel = (Channel) ts.next();
            channels.add(channel);
        }
        return channels;
    }

    private static int compareDates(Date d1, Date d2) {
        if(d1.after(d2)) {
            return -1;
        } else if (d1.before(d2)) {
            return 1;
        } else {
            return 0;
        }
    }

    public static List<Article> OrderArticlesByDateDesc(List<Article> news) {
        Collections.sort(news, new Comparator<Article>() {
            @Override
            public int compare(Article o1, Article o2) {
                Date d1 = o1.getAddedAt(), d2 = o2.getAddedAt();
                return compareDates(d1,d2);
            }
        });
        return news;
    }

    public static List<ChannelArticle> OrderChannelArticlesByDateDesc(List<ChannelArticle> news) {
        Collections.sort(news, new Comparator<ChannelArticle>() {
            @Override
            public int compare(ChannelArticle o1, ChannelArticle o2) {
                Date d1 = o1.getArticle().getAddedAt(), d2 = o2.getArticle().getAddedAt();
                return compareDates(d1,d2);
            }
        });
        return news;
    }

    public static List<ChannelArticle> OrderChannelArticleByLikesDesc(List<ChannelArticle> news) {
        Collections.sort(news, new Comparator<ChannelArticle>() {
            @Override
            public int compare(ChannelArticle o1, ChannelArticle o2) {
                int firstLikes = o1.getArticle().getLikes();
                int secondLikes = o2.getArticle().getLikes();
                if(firstLikes > secondLikes) {
                    return -1;
                } else if(firstLikes < secondLikes) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        return news;
    }


    public static List<Article> getArticles(String orderBy) {
        String condition = "from Article order by " + orderBy;
        List<Article> l = null;
        try {
            PersistentSession session = ProjectEAPersistentManager.instance().getSession();
            Query query = session.createQuery(condition);
            l = query.list();
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return l;
    }


    public static List<ChannelArticle> getUserNews(User u) {
        List<ChannelArticle> articles = new ArrayList<>();
        Iterator ts = u._subscriptions.getIterator();
        while(ts.hasNext()) {
            Channel channel = (Channel) ts.next();
            Iterator ti = channel._articles.getIterator();
            while (ti.hasNext()) {
                Article a = (Article) ti.next();
                ChannelArticle ca = new ChannelArticle(channel.getName(), a);
                articles.add(ca);
            }
        }
        return articles;
    }


    public static List<ChannelArticle> getUserNews(User u, String category) {
        List<ChannelArticle> articles = new ArrayList<>();
        Iterator ts = u._subscriptions.getIterator();
        while(ts.hasNext()) {
            Channel channel = (Channel) ts.next();
            Iterator ti = channel._articles.getIterator();
            while (ti.hasNext()) {
                Article a = (Article) ti.next();
                Iterator ta = a._categories.getIterator();
                while (ta.hasNext()) {
                    Category c = (Category) ta.next();
                    if (c.getDescription().equals(category)) {
                        ChannelArticle ca = new ChannelArticle(channel.getName(), a);
                        articles.add(ca);
                        break;
                    }
                }
            }
        }
        return articles;
    }


    public static List<String> getUserCategories(User u) {
        List<String> categories = new ArrayList<>();
        Iterator itr = u._preferences.getIterator();
        while(itr.hasNext()) {
            Category c = (Category) itr.next();
            categories.add(c.getDescription());
        }
        return categories;
    }


    public static User getUser(int token) {
        User u = null;
        try {
            u = UserDAO.getUserByORMID(token);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return u;
    }


    public static Channel createChannel(String channelName, String description,
                                        List<String> channelTypes) {
        Channel c = new Channel();
        c.setName(channelName);
        c.setDescription(description);
        c.setLikes(0);
        c.setSubscribers(0);
        if (channelTypes.size() != 0) {
            for (String type : channelTypes) {
                Category ca = findCategory(type);
                c.categories.add(ca);
            }
        }
        try {
            ChannelDAO.save(c);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return c;
    }


    public static User createUser(String username, String password, String name, int age,
                                  String country, List<String> userTypes, Channel c) {
        User user = new User();
        if(userTypes.size() != 0) {
            for (String type : userTypes) {
                Category ca = findCategory(type);
                user._preferences.add(ca);
            }
        }
        user.setUsername(username);
        user.setPassword(password);
        user.setName(name);
        user.setAge((short)age);
        user.setCountry(country);
        user.set_myChannel(c);
        try {
            UserDAO.save(user);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return user;
    }


    public static User getUser(String condition) {
        User u = null;
        try {
            u = UserDAO.loadUserByQuery(condition, "id");
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return u;
    }


    public static Channel getChannel(String condition) {
        Channel c = null;
        try {
            c = ChannelDAO.loadChannelByQuery(condition, "id");
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return c;
    }

    public static Channel getChannel(int id) {
        Channel c = null;
        try {
            c = ChannelDAO.loadChannelByORMID(id);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return c;
    }

    public static boolean createArticle(Channel c, String title, String content, String image_url) {
        Article a = new Article();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        a.setChannel(c);
        a.setLikes(0);
        a.setAddedAt(date);
        a.setTitle(title);
        a.setImage_url(image_url);
        a.setContent(content);
        try {
            ArticleDAO.save(a);
            return true;
        } catch (PersistentException e ) {
            e.printStackTrace();
            return false;
        }
    }


    public static String buildSimpleCondition(String column, String condition) {
        StringBuilder sb = new StringBuilder();
        sb.append(column);
        sb.append("=");
        sb.append("'");
        sb.append(condition);
        sb.append("'");
        return sb.toString();
    }


    public static String buildComplexCondition(Map<String, String> details) {
        StringBuilder sb = new StringBuilder();
        int size = details.size(), i = 1;
        for(String key : details.keySet()) {
            sb.append(key);
            sb.append("=");
            sb.append("'");
            sb.append(details.get(key));
            sb.append("'");
            if(i < size) {
                sb.append(" and ");
                i++;
            }
        }
        return sb.toString();
    }


    private static Category findCategory(String type)  {
        String condition = buildSimpleCondition("description", type);
        Category ca = null;
        try {
            ca = CategoryDAO.loadCategoryByQuery(condition, "id");
            if(ca == null) {
                ca = new Category();
                ca.setDescription(type);
                CategoryDAO.save(ca);
            }
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return ca;
    }

}
