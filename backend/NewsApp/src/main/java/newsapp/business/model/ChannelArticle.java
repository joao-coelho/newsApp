package newsapp.business.model;

public class ChannelArticle {

    private String channelName;
    private String channelIcon;
    private Article article;

    public ChannelArticle(String channelName, String channelIcon, Article article) {
        this.channelName = channelName;
        this.channelIcon = channelIcon;
        this.article = article;
    }

    public String getChannelIcon() {
        return channelIcon;
    }

    public void setChannelIcon(String channelIcon) {
        this.channelIcon = channelIcon;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
}
