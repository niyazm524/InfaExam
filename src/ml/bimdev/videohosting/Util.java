package ml.bimdev.videohosting;

import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util {
    static Pattern userPattern;

    static {
        userPattern = Pattern.compile("[A-z0-9_]{3,15}");
    }

    public static String generateUUID() {
        return UUID.randomUUID().toString();
    }

    public static boolean isUsernameCorrect(String username) {
        Matcher matcher = userPattern.matcher(username);
        return matcher.matches();
    }
}
