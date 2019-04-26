package com.willmart.weekOne;
import java.util.Scanner;

public class GetQuotient {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("What's a good number?");
        int first = Integer.parseInt(reader.nextLine());

        System.out.println("What's another good number?");
        int second = Integer.parseInt(reader.nextLine());

        double quotient = (double) first / second;

        System.out.print("The quotient of the two numbers is " + quotient);
    }
}
