package backend;

import java.util.List;

public interface IFeedService {

    BaseFeed getBaseFeed(int token);
    List<NewsHeader> trending();
    List<ChannelHeader> subscriptions(int token);
    List<NewsHeader> newsByCategory(int token, String category);
}
