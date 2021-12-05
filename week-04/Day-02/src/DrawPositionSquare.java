import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DrawPositionSquare {

    public static void drawImage(Graphics graphics){
        // Create a function that takes 3 parameters and draws one square
        // Parameters: the x and y coordinates of the square's top left corner and the graphics
        // The function shall draw a 50x50 square from that point
        // Draw 3 squares with that function
        // Avoid code duplication!
        Random ran = new Random();
        int ranNumber= ran.nextInt(5);
        graphics.setColor(Color.BLACK);
        drawSquare(HEIGHT/5*1,WIDTH/5*ranNumber,graphics);

        graphics.setColor(Color.YELLOW);
        drawSquare(HEIGHT/5*2,WIDTH/5*ranNumber,graphics);

        graphics.setColor(Color.BLUE);
        drawSquare(HEIGHT/5*3,WIDTH/5*ranNumber,graphics);


    }
    public static void drawSquare(int x,int y,Graphics g){
        g.fillRect(x,y,50,50);
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
