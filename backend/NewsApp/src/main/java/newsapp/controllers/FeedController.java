package newsapp.controllers;

import newsapp.services.*;
import newsapp.services.data.BaseFeed;
import newsapp.services.data.ChannelHeader;
import newsapp.services.data.LikeComment;
import newsapp.services.data.NewsHeader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/feed")
public class FeedController {

    @Autowired
    IFeedService fs;

    @RequestMapping(value = "/base", method = RequestMethod.GET)
    public BaseFeed getBaseInfo(@RequestParam("token") int token) {
        BaseFeed bf = fs.getBaseFeed(token);
        return bf;
    }

    @RequestMapping(value = "/trending", method = RequestMethod.GET)
    public List<NewsHeader> trending() {
        List<NewsHeader> trending = fs.trending();
        return trending;
    }

    @RequestMapping(value = "/subscriptions", method = RequestMethod.GET)
    public List<ChannelHeader> subscriptions(@RequestParam("token") int token) {
        List<ChannelHeader> subscriptions = fs.subscriptions(token);
        return subscriptions;
    }

    @RequestMapping(value = "/category", method = RequestMethod.GET)
    public List<NewsHeader> getNewsByCategory(@RequestParam("token") int token
                                              /*@RequestParam("category") String category*/) {
        List<NewsHeader> news = fs.newsByCategory(token, "Desporto");
        return news;
    }

    @RequestMapping(value = "/likeComment", method = RequestMethod.GET)
    public LikeComment getNewsWithLikeComment(@RequestParam("token") int token) {
        LikeComment lc = fs.getNewsWithLikeComment(token);
        return lc;
    }

    @RequestMapping(value = "/newFeed", method = RequestMethod.GET)
    public List<NewsHeader> getNewFeed(@RequestParam("token") int token) {
        List<NewsHeader> feed = fs.getNewFeed(token);
        return feed;
    }

}
