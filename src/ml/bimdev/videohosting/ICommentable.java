package ml.bimdev.videohosting;

public interface ICommentable {
    default public boolean isCommentableByUser(User u) {
        return true;
    }

    public void comment(User u, String commentBody);
    public void removeComment(User u, Comment comment);
}
