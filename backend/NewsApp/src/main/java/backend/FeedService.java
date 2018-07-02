package backend;

import newsapp.*;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class FeedService implements IFeedService {

    public BaseFeed getBaseFeed(int token) {
        BaseFeed bf = new BaseFeed();
        User user = NewsApp.getUser(token);
        List<String> categories = NewsApp.getUserCategories(user);
        List<ChannelArticle> articles = NewsApp.getUserNews(user);
        List<ChannelArticle> sortedArticles = NewsApp.OrderChannelArticlesByDateDesc(articles);
        List<NewsHeader> newsHeaders = new ArrayList<>();
        for(ChannelArticle a : sortedArticles) {
            NewsHeader n = buildArticleHeader(a);
            newsHeaders.add(n);
        }
        bf.setChannelName(user.get_myChannel().getName());
        bf.setCategories(categories);
        bf.setNews(newsHeaders);
        return bf;
    }

    public List<NewsHeader> trending() {
        List<Channel> channels = NewsApp.getChannels();
        List<ChannelArticle> articles = NewsApp.getArticles(channels);
        List<ChannelArticle> sortedArticles = NewsApp. OrderChannelArticleByLikesDesc(articles);
        List<NewsHeader> newsHeaders = new ArrayList<>();
        for(ChannelArticle a : sortedArticles) {
            NewsHeader n = buildArticleHeader(a);
            newsHeaders.add(n);
        }
        return newsHeaders;
    }

  
    public List<ChannelHeader> subscriptions(int token) {
        List<Channel> channels = NewsApp.getUserSubscriptionChannels(token);
        List<ChannelHeader> channelHeaders = new ArrayList<>();
        for(Channel c : channels) {
            ChannelHeader ch = buildChannelHeader(c);
            channelHeaders.add(ch);
        }
        return channelHeaders;
    }

    public List<NewsHeader> newsByCategory(int token, String category) {
        User u = NewsApp.getUser(token);
        List<ChannelArticle> articles = NewsApp.getUserNews(u, category);
        List<ChannelArticle> sortedArticles = NewsApp.OrderChannelArticlesByDateDesc(articles);
        List<NewsHeader> news = new ArrayList<>();
        for(ChannelArticle a : sortedArticles) {
            NewsHeader n = buildArticleHeader(a);
            news.add(n);
        }
        return news;
    }

    private ChannelHeader buildChannelHeader(Channel c) {
        ChannelHeader ch = new ChannelHeader();
        ch.setChannelName(c.getName());
        ch.setDescription(c.getDescription());
        ch.setId(c.getID());
        ch.setLikes(c.getLikes());
        ch.setSubscribers(c.getSubscribers());
        return ch;
    }

    private NewsHeader buildArticleHeader(ChannelArticle a) {
        NewsHeader newsHeader = new NewsHeader();
        Article article = a.getArticle();
        newsHeader.setContent(article.getContent());
        newsHeader.setDate(article.getAddedAt());
        newsHeader.setId(article.getID());
        newsHeader.setTitle(article.getTitle());
        newsHeader.setLikes(article.getLikes());
        newsHeader.setChannelName(a.getChannelName());
        return newsHeader;
    }

}
