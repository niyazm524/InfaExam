package ml.bimdev.videohosting;

import ml.bimdev.videohosting.exceptions.WrongUsernameException;

public class CommonUser extends User {
    public CommonUser(String username, String firstName, String lastName) throws WrongUsernameException {
        super(username, firstName, lastName);
    }


}
