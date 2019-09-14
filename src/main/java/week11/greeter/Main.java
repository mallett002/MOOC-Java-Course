package week11.greeter;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        GreeterUI ui = new GreeterUI();
        SwingUtilities.invokeLater(ui);
    }
}
