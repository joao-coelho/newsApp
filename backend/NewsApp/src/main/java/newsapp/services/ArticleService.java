package newsapp.services;

import newsapp.business.model.Article;
import newsapp.business.model.Category;
import newsapp.business.model.Channel;
import newsapp.business.NewsApp;
import newsapp.business.model.Comment;
import newsapp.services.data.ArticleDetails;
import newsapp.services.data.CommentDetails;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class ArticleService implements IArticleService {


    public boolean isLiked(int article_id, int user_id) {
        return NewsApp.isLiked(article_id, user_id);
    }

    /* Like button was pressed, this will trigger a like or a dislike */
    public void like(int article_id, int user_id) {
        NewsApp.like(article_id, user_id);
    }

    @Override
    public ArticleDetails getArticle(int id) {
        List<String> categories = new ArrayList<>();
        Iterator it;
        ArticleDetails articleDetails = new ArticleDetails();

        Article article = NewsApp.getArticle(id);
        if(article != null) {
            Channel channel = article.getChannel();
            articleDetails.setChannel_id(channel.getID());
            articleDetails.setContent(article.getContent());
            articleDetails.setImage_url(article.getImage_url());
            articleDetails.setTitle(article.getTitle());
            articleDetails.setToken(0);
            it = article._categories.getIterator();
            while(it.hasNext()) {
                Category c = (Category) it.next();
                categories.add(c.getDescription());
            }
        }

        return articleDetails;
    }

    public boolean addArticle(ArticleDetails a) {
        Channel channel = NewsApp.getChannel(a.getChannel_id());
        boolean result = NewsApp.createArticle(channel,a.getTitle(),a.getContent(), a.getImage_url());
        return result;
    }

    public List<CommentDetails> getArticleComments(int article_id) {
        List<CommentDetails> result = new ArrayList<>();
        for(Comment c : NewsApp.getArticleComments(article_id))
            result.add(new CommentDetails(c));
        return result;
    }
}
