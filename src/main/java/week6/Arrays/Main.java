package week6.Arrays;

import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner reader = new Scanner(System.in);
        int[] array = {5, 1, 3, 4, 2};
//        System.out.println(sum(array));
//        printElegantly(array);

        // Asking For user input for array values:
        System.out.print("How many values? ");
        int amountOfValues = Integer.parseInt(reader.nextLine());

        int[] values = new int[amountOfValues];
        System.out.println("Enter the values: ");
        for (int i = 0; i < amountOfValues; i++) {
            values[i] = Integer.parseInt(reader.nextLine());
        }

        System.out.println("Here are your values: ");
        for (int val : values) {
            System.out.println(val);
        }
    }

    public static int sum(int[] arr) {
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static void printElegantly(int[] arr) {
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                result += arr[i];
            } else {
                result += arr[i] + ", ";
            }
        }
        System.out.println(result);
    }
}
