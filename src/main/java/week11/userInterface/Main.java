package week11.userInterface;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        UserInterface ui = new UserInterface();

        // Swing UI's are started with "invokeLater(Runnable runnable)"
        SwingUtilities.invokeLater(ui); // ui object implements Runnable
    }
}
