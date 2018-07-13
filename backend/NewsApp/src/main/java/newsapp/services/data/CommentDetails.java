package newsapp.services.data;

import newsapp.business.model.Comment;
import newsapp.business.model.User;

import java.util.Date;

public class CommentDetails {
    private String content;
    private Date addedAt;
    private String author;
    private int idAuthor;
    private String avatar;

    public CommentDetails() { }

    public CommentDetails(Comment comment) {
        User author = comment.get_author();
        this.addedAt = comment.getAddedAt();
        this.author = author.getName();
        this.avatar = author.get_myChannel().getImage_url();
        this.idAuthor = author.getID();
        this.content = comment.getContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getAddedAt() {
        return addedAt;
    }

    public void setAddedAt(Date addedAt) {
        this.addedAt = addedAt;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(int idAuthor) {
        this.idAuthor = idAuthor;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
