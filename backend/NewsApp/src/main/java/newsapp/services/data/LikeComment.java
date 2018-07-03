package newsapp.services.data;

import java.util.List;

public class LikeComment {

    private List<NewsHeader> newsWithLike;
    private List<NewsHeader> newsWithComment;

    public LikeComment() {

    }

    public List<NewsHeader> getNewsWithLike() {
        return newsWithLike;
    }

    public void setNewsWithLike(List<NewsHeader> newsWithLike) {
        this.newsWithLike = newsWithLike;
    }

    public List<NewsHeader> getNewsWithComment() {
        return newsWithComment;
    }

    public void setNewsWithComment(List<NewsHeader> newsWithComment) {
        this.newsWithComment = newsWithComment;
    }
}
