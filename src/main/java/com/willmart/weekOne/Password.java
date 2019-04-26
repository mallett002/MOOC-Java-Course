package com.willmart.weekOne;

import java.util.Scanner;

public class Password {
    public static void main(String... args) {
        Scanner reader = new Scanner(System.in);

        String secret = "you smell";
        String prompt = "Enter the password to see the secret: ";
        String password = "carrot";
        String input;

        System.out.print(prompt);
        input = reader.nextLine();

        while(!input.equals(password)) {
            System.out.println("Wrong!");

            System.out.print(prompt);
            input = reader.nextLine();
        }

        System.out.println("Right!");
        System.out.println("The secret is: " + secret);
    }
}
