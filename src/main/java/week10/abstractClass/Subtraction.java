package week10.abstractClass;

import java.util.Scanner;

public class Subtraction extends Operation {

    public Subtraction() {
        super("Subtraction");
    }

    @Override
    public void execute(Scanner reader) {
        System.out.print("First number: ");
        int first = Integer.parseInt(reader.nextLine());

        System.out.print("Second number: ");
        int second = Integer.parseInt(reader.nextLine());

        System.out.println("The difference is " + (first - second));
    }
}
