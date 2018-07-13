package newsapp.services;

import newsapp.services.data.ArticleDetails;
import newsapp.services.data.CommentDetails;

import java.util.Date;
import java.util.List;

public interface IArticleService {
    boolean addArticle(ArticleDetails ad);
    ArticleDetails getArticle(int id);
    boolean isLiked(int article_id, int user_id);
    void like(int article_id, int user_id);
    List<CommentDetails> getArticleComments(int article_id);
    boolean addComment(int article_id, Date addedAt, int user_id, String content);
}
