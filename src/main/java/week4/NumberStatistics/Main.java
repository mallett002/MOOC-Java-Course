package week4.NumberStatistics;

import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner reader = new Scanner(System.in);
        // 1- Basic usage of the NumberStatistics class
//        NumberStatistics stats = new NumberStatistics();
//        stats.addNumber(3);
//        stats.addNumber(5);
//        stats.addNumber(1);
//        stats.addNumber(2);
//        System.out.println("Amount: " + stats.amountOfNumbers());
//        System.out.println("sum: " + stats.sum());
//        System.out.println("average: " + stats.average());

        // 2- Asking user for numbers and printing sum
//        System.out.println("Type numbers, enter -1 to exit");
//        while (true) {
//            int number = Integer.parseInt(reader.nextLine());
//            if (number == -1) {
//                System.out.println("Sum of your numbers is: " + stats.sum());
//                break;
//            } else {
//                stats.addNumber(number);
//            }
//        }

        // 3-summing all, even, and odd numbers
        NumberStatistics allNumbers = new NumberStatistics();
        NumberStatistics evenNumbers = new NumberStatistics();
        NumberStatistics oddNumbers = new NumberStatistics();

        System.out.println("Type numbers, enter -1 to exit");

        while (true) {
            int number = Integer.parseInt(reader.nextLine());
            if (number == -1) {
                System.out.println("Sum: " + allNumbers.sum());
                System.out.println("sum of even: " + evenNumbers.sum());
                System.out.println("sum of odd: " + oddNumbers.sum());
                break;
            } else {
                if (number % 2 == 0) {
                    allNumbers.addNumber(number);
                    evenNumbers.addNumber(number);
                } else {
                    allNumbers.addNumber(number);
                    oddNumbers.addNumber(number);
                }
            }
        }
    }
}
