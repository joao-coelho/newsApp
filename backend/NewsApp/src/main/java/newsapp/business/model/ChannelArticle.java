package newsapp.business.model;

public class ChannelArticle {

    private String channelName;
    private Article article;

    public ChannelArticle(String channelName, Article article) {
        this.channelName = channelName;
        this.article = article;
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
