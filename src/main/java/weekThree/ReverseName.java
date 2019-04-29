package weekThree;

import java.util.Scanner;

public class ReverseName {
    public static void main(String... args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
        String name = reader.nextLine();

        String reversedName = reverse(name);
        System.out.println("In reverse order: " + reversedName);
    }

    private static String reverse(String name) {
        String result = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            char letter = name.charAt(i);
            result += letter;
        }

        return result;
    }
}
