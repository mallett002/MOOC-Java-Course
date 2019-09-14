package week11.greeter;

import javax.swing.*;
import java.awt.*;

public class GreeterUI implements Runnable {

    JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Swing on");
        frame.setPreferredSize(new Dimension(400, 200));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    public void createComponents(Container container) {
        JLabel label = new JLabel("Hi!");
        container.add(label);
    }

    public JFrame getFrame() {
        return this.frame;
    }
}
