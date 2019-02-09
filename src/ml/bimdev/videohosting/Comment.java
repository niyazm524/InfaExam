package ml.bimdev.videohosting;

import com.sun.istack.internal.NotNull;

import javax.jws.WebParam;
import java.util.Date;
import java.util.LinkedList;

public class Comment implements  ICommentable {
    private User owner;
    private String body;
    private Date createdTime;
    private LinkedList<Comment> comments;

    public Comment(@NotNull User owner, @NotNull String body) {
        this.owner = owner;
        this.body = body;
        createdTime = new Date();
    }

    @Override
    public void comment(User u, String commentBody) {
        if(comments == null)    comments = new LinkedList<>();

        comments.add(new Comment(u, commentBody));
    }

    @Override
    public void removeComment(User u, Comment comment) {
        if(u instanceof Moderator || u == comment.getOwner()) {
            comments.remove(comment);
        }
    }

    public User getOwner() {
        return owner;
    }

    public String getBody() {
        return body;
    }

    public Date getCreatedTime() {
        return createdTime;
    }
}
