package week10.abstractClass;

import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        UserInterface ui = new UserInterface(new Scanner(System.in));
        ui.addOperation(new Addition());
        ui.addOperation(new Subtraction());
        ui.start();
    }
}
