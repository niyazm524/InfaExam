package ml.bimdev.videohosting.exceptions;

public class WrongUsernameException extends Exception {
    public WrongUsernameException(String message) {
        super("Username " + message + "is not correct!");
    }
}
