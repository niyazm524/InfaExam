package ml.bimdev.videohosting;

import ml.bimdev.videohosting.exceptions.WrongUsernameException;

public class Moderator extends User {
    public Moderator(String username, String firstName, String lastName) throws WrongUsernameException {
        super(username, firstName, lastName);
    }

    public int getPerms() {
        return 2;
    }
}
