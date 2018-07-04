package newsapp.services.data;

import java.util.List;

public class LoginResponse {

    private boolean success;
    private int token;
    private String channelName;
    private List<String> categories;
    private List<NewsHeader> news;
    private int channel_id;
    private String channelIcon;


    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getToken() {
        return token;
    }

    public void setToken(int token) {
        this.token = token;
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

    public String getChannelIcon() {
        return channelIcon;
    }

    public void setChannelIcon(String icon) {
        this.channelIcon = icon;
    }

    public int getChannelId() {
        return channel_id;
    }

    public void setChannelId(int id) {
        this.channel_id = id;
    }

    public List<NewsHeader> getNews() {
        return news;
    }

    public void setNews(List<NewsHeader> news) {
        this.news = news;
    }
}
