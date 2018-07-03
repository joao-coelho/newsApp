package newsapp.services;

import newsapp.services.data.BaseFeed;
import newsapp.services.data.ChannelHeader;
import newsapp.services.data.LikeComment;
import newsapp.services.data.NewsHeader;

import java.util.List;

public interface IFeedService {

    BaseFeed getBaseFeed(int token);
    List<NewsHeader> trending();
    List<ChannelHeader> subscriptions(int token);
    List<NewsHeader> newsByCategory(int token, String category);
    LikeComment getNewsWithLikeComment(int token);
    List<NewsHeader> getNewFeed(int token);
}
