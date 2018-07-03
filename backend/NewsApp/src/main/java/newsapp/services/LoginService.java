package newsapp.services;

import newsapp.business.NewsApp;
import newsapp.business.model.Article;
import newsapp.business.model.Channel;
import newsapp.business.model.ChannelArticle;
import newsapp.business.model.User;
import newsapp.services.data.Login;
import newsapp.services.data.LoginResponse;
import newsapp.services.data.NewsHeader;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class LoginService implements ILoginService {

    public LoginResponse verifyCredentials(Login login) {
        Map<String, String> conditions = new HashMap<>();
        conditions.put("username", login.getUsername());
        conditions.put("password", login.getPassword());
        String condition = NewsApp.buildComplexCondition(conditions);
        User u = NewsApp.getUser(condition);
        LoginResponse lr = new LoginResponse();
        if (u == null) {
            lr.setSuccess(false);
        } else {
            lr.setSuccess(true);
            lr.setToken(u.getID());
            Channel channel = u.get_myChannel();
            lr.setChannelName(channel.getName());
            List<String> categories = NewsApp.getUserCategories(u);
            lr.setCategories(categories);
            List<ChannelArticle> articles = NewsApp.getUserNews(u);
            List<ChannelArticle> sortedArticles = NewsApp.OrderChannelArticlesByDateDesc(articles);
            List<NewsHeader> newsHeaders = new ArrayList<>();
            lr.setChannelId(channel.getID());
            for (ChannelArticle a : sortedArticles) {
                NewsHeader n = buildArticleHeader(a);
                newsHeaders.add(n);
            }
            lr.setNews(newsHeaders);
        }
        return lr;
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
