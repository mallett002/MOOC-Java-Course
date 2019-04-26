package com.willmart.weekOne;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) throws Exception {
       Scanner reader = new Scanner(System.in);

       System.out.print("Type a number: ");
       int input = Integer.parseInt(reader.nextLine());

       boolean inputIsEven = input % 2 == 0;

       if (inputIsEven) {
           System.out.println("Your number is even.");
       } else {
           System.out.println("Your number is odd...");
       }
    }
}
