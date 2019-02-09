package ml.bimdev.videohosting;

import ml.bimdev.videohosting.exceptions.WrongUsernameException;

import java.util.ArrayList;

public abstract class User {
    protected long id;
    protected String uuid;
    protected String username;
    protected String firstName, lastName;
    protected Integer age;
    protected ArrayList<Channel> subscribtions = new ArrayList<>();

    public User(String username, String firstName, String lastName) throws WrongUsernameException{
        this.firstName = firstName;
        this.lastName = lastName;

        if(Util.isUsernameCorrect(username)) {
            this.username = username;
        } else {
            throw new WrongUsernameException(username);
        }
    }

    public User(String username, String firstName, String lastName, Integer age) throws WrongUsernameException {
        this(username, firstName, lastName);
        this.age = age;
    }
}
