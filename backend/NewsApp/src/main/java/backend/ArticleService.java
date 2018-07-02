package backend;

import newsapp.Channel;
import newsapp.NewsApp;
import org.springframework.stereotype.Service;

@Service
public class ArticleService implements IArticleService {

    public boolean addArticle(ArticleDetails a) {
        Channel channel = NewsApp.getChannel(a.getChannel_id());
        boolean result = NewsApp.createArticle(channel,a.getTitle(),a.getContent(), a.getImage_url());
        return result;
    }
}
