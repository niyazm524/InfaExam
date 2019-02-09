package ml.bimdev.videohosting;

import ml.bimdev.videohosting.exceptions.WrongUsernameException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws WrongUsernameException {
        User u;

        Scanner sc = new Scanner(System.in);
        if(sc.nextInt() % 2 == 0) {
            u = new Moderator("moder", "ghj", "vbnm");
        } else {
            u = new CommonUser();
        }


    }
}
