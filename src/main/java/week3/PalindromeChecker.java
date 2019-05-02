package week3;

import java.util.Scanner;

public class PalindromeChecker {
    private static boolean isPalindrome(String text) {
        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            char letter = text.charAt(i);
            reversed += letter;
        }

        return text.equals(reversed);
    }

    public static void main(String... args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a text: ");
        String text = reader.nextLine();

        if (isPalindrome(text)) {
            System.out.println("The text " + text + " is a palindrome!");
        } else {
            System.out.println("The text " + text + " is not a palindrome");
        }
    }
}
