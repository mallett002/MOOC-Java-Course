package week1;
import java.util.Scanner;

public class SumOfAges {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // First person
        System.out.println("What's your name?");
        String you = reader.nextLine();
        System.out.println("How old are you?");
        int firstAge = Integer.parseInt(reader.nextLine());

        // Second person
        System.out.println("What's your friend's name?");
        String other = reader.nextLine();
        System.out.println("What's their age?");
        int secondAge = Integer.parseInt(reader.nextLine());

        // Sum it up
        int sum = firstAge + secondAge;
        System.out.println(you + " and " + other + " are " + sum + " years old in total!");
    }
}
