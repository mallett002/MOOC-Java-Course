package com.willmart.weekOne;

import java.util.Scanner;

public class AgeCheck {
    public static void main(String... args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("How old are you? ");
        int age = Integer.parseInt(reader.nextLine());

        if (age > 120 || age < 0) {
            System.out.println("Impossible!");
        } else {
            System.out.println("Ok");
        }
    }
}
