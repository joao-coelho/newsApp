package newsapp.services;

import newsapp.data.*;
import newsapp.services.data.BaseFeed;
import newsapp.services.data.ChannelHeader;
import newsapp.services.data.LikeComment;
import newsapp.services.data.NewsHeader;
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

    public LikeComment getNewsWithLikeComment(int token) {
        User u = NewsApp.getUser(token);
        List<ChannelArticle> likedArticles = NewsApp.getLikedArticles(u);
        List<NewsHeader> likedNews = new ArrayList<>();
        for(ChannelArticle ca : likedArticles) {
            NewsHeader n = buildArticleHeader(ca);
            likedNews.add(n);
        }
        List<Channel> channels = NewsApp.getChannels();
        List<ChannelArticle> commentedArticles = NewsApp.getCommentedArticles(channels, token);
        List<NewsHeader> commentedNews = new ArrayList<>();
        for(ChannelArticle a : commentedArticles) {
            NewsHeader nh = buildArticleHeader(a);
            commentedNews.add(nh);
        }
        LikeComment lc = new LikeComment();
        lc.setNewsWithLike(likedNews);
        lc.setNewsWithComment(commentedNews);
        return lc;

    }

    public List<NewsHeader> getNewFeed(int token) {
        User user = NewsApp.getUser(token);
        List<ChannelArticle> articles = NewsApp.getUserNews(user);
        List<ChannelArticle> sortedArticles = NewsApp.OrderChannelArticlesByDateDesc(articles);
        List<NewsHeader> newsHeaders = new ArrayList<>();
        for(ChannelArticle a : sortedArticles) {
            NewsHeader n = buildArticleHeader(a);
            newsHeaders.add(n);
        }
        return newsHeaders;
    }

    private ChannelHeader buildChannelHeader(Channel c) {
        ChannelHeader ch = new ChannelHeader();
        ch.setChannelName(c.getName());
        ch.setDescription(c.getDescription());
        ch.setId(c.getID());
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
