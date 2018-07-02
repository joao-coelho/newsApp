package backend;

import org.springframework.web.bind.annotation.RequestBody;

public interface IArticleService {
    boolean addArticle(ArticleDetails ad);
}
