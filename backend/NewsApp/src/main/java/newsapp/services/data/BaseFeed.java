package newsapp.services.data;

import java.util.List;

public class BaseFeed {

    private boolean success;
    private String channelName;
    private List<String> categories;
    private List<NewsHeader> news;

    public BaseFeed() {

    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public List<NewsHeader> getNews() {
        return news;
    }

    public void setNews(List<NewsHeader> news) {
        this.news = news;
    }

}

