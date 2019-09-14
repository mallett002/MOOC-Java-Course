package week11.userInterface;

import javax.swing.*;
import java.awt.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    public UserInterface() {}

    @Override
    public void run() {
        frame = new JFrame("Title");
        frame.setPreferredSize(new Dimension(200, 100)); // in pixels
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane()); // Passes Container to createComponents

        frame.pack(); // puts it all together & sorts components contained by JFrame
        frame.setVisible(true);
    }

    // Can add user interface components
    public void createComponents(Container container) {
        // First components:--------------------------------------------------------------------------------------------
//        JLabel text = new JLabel("Text field!");
//        JButton button = new JButton("Click!");
//
//        container.add(text);
//        container.add(button);

        // Using BorderLayout Layout manager----------------------------------------------------------------------------
//        container.setLayout(new BorderLayout()); // This is default with JFrame
//
//        container.add(new JButton("North"), BorderLayout.NORTH);
//        container.add(new JButton("East"), BorderLayout.EAST);
//        container.add(new JButton("South"), BorderLayout.SOUTH);
//        container.add(new JButton("West"), BorderLayout.WEST);
//        container.add(new JButton("Center"), BorderLayout.CENTER);
//        container.add(new JButton("Default (Center)"));

        // Using BoxLayout Layout manager-------------------------------------------------------------------------------
        // Horizontally:
//        BoxLayout horizontalLayout = new BoxLayout(container, BoxLayout.X_AXIS);
//        container.setLayout(horizontalLayout);
//
//        container.add(new JLabel("First!"));
//        container.add(new JLabel("Second!"));
//        container.add(new JLabel("Third!"));

        // Vertically:
//        BoxLayout verticalLayout = new BoxLayout(container, BoxLayout.Y_AXIS);
//        container.setLayout(verticalLayout);
//
//        container.add(new JLabel("First!"));
//        container.add(new JLabel("Second!"));
//        container.add(new JLabel("Third!"));

        // Using button groups: Selecting one deselects others
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS); // vertical
        container.setLayout(layout);

        container.add(new JLabel("Choose meat or fish:"));

        JRadioButton meat = new JRadioButton("Meat");
        JRadioButton fish = new JRadioButton("Fish");

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(meat);
        buttonGroup.add(fish);

        container.add(meat);
        container.add(fish);
    }

    public JFrame getFrame() {
        return this.frame;
    }
}
