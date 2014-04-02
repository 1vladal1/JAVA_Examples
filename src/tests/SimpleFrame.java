package tests;

import javax.swing.*;

/**
 * Created by vlad on 26.03.14.
 */
public class SimpleFrame {

    public static void main(String[] args) {
        final int WIDTH = 800;
        final int HEIGHT = 600;
        final String TITLE = "Test frame 12345";

        JFrame frame = new JFrame();
        frame.setSize(WIDTH, HEIGHT);
        frame.setTitle(TITLE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
