import javax.swing.*;

import java.awt.*;
import java.util.Arrays;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DrawConnectTheDots {
    public static void drawImage(Graphics graphics) {
        // Create a function that takes 2 parameters:
        // an array of {x, y} points and graphics
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}
        int[][] box ={{10, 10}, {290,  10}, {290, 290}, {10, 290}};
        int[][] points={{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},{120, 100}, {85, 130}, {50, 100}};
        connect(box,graphics);
        connect(points,graphics);




    }


    public static void connect(int[][] points,Graphics g ){
        for (int i = 0; i < points.length-1; i++) {
            g.drawLine(points[i][0],points[i][1],points[i+1][0],points[i+1][1]);
        }
        g.drawLine(points[points.length-1][0],points[points.length-1][1],points[0][0],points[0][1]);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            drawImage(graphics);
        }
    }
}