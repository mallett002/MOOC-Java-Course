package com.willmart.weekOne;

import java.util.Scanner;

public class UserNames {
    public static void main(String... args) {
        Scanner reader = new Scanner(System.in);
        String loggedIn = "You are now logged into the system!";
        String error = "Your username or password was invalid!";

        System.out.print("Type your username: ");
        String userName = reader.nextLine();

        System.out.print("Type your password: ");
        String password = reader.nextLine();

        if (userName.equals("alex")) {
            if (password.equals("mightyducks")) {
                System.out.println(loggedIn);
            } else {
                System.out.println(error);
            }
        } else if(userName.equals("emily")) {
            if (password.equals("cat")) {
                System.out.println(loggedIn);
            } else {
                System.out.println(error);
            }
        } else {
            System.out.println("That username does not exist!");
        }
    }
}
