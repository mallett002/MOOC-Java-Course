package com.willmart.weekOne;
import java.util.Scanner;

public class BiggerNumber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Pick a number.");
        int first = Integer.parseInt(reader.nextLine());

        System.out.println("Pick another number.");
        int second = Integer.parseInt(reader.nextLine());

        int larger = Math.max(first, second);

        System.out.println("The larger of the two numbers is " + larger);
    }
}
