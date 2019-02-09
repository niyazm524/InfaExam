package ml.bimdev.videohosting;

import java.util.LinkedList;

public class Video implements ICommentable {
    String UUID;
    protected User owner;
    protected String videoPath;
    LinkedList<Comment> comments = new LinkedList<>();

    public Video(User owner, String videoPath) {
        this.UUID = Util.generateUUID();
        this.owner = owner;
        this.videoPath = videoPath;
    }

    @Override
    public boolean isCommentableByUser(User u) {
        return false;
    }

    @Override
    public void comment(User u, String commentBody) {
        // comment
    }

    @Override
    public void removeComment(User u, Comment comment) {
        if(u instanceof Moderator || u == comment.getOwner()) {
            // remove comment
        }
    }
}
