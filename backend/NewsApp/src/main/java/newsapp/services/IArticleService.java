package newsapp.services;

import newsapp.services.data.ArticleDetails;

public interface IArticleService {
    boolean addArticle(ArticleDetails ad);
    ArticleDetails getArticle(int id);
    boolean isLiked(int article_id, int user_id);
    void like(int article_id, int user_id);
}
