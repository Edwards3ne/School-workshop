import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DrawFourRectangles {

    public static void drawImage(Graphics graphics){
        // Draw four different size and color rectangles
        // Avoid code duplication!
        Random random = new Random();
        int f = random.nextInt(5);
        int a = random.nextInt(20);
        graphics.setColor(Color.YELLOW);
        rectangeRandom(HEIGHT/5*f,WIDTH/5*f,10*a,10*a,graphics);

        graphics.setColor(Color.RED);
        rectangeRandom(HEIGHT/5*3,WIDTH/5*f,10*a,10*a,graphics);

        graphics.setColor(Color.BLUE);
        rectangeRandom(HEIGHT/5*2,WIDTH/5*f,10*a,10*a,graphics);

        graphics.setColor(Color.BLACK);
        rectangeRandom(HEIGHT/5*4,WIDTH/5*f,10*a,10*a,graphics);

    }
    public static void rectangeRandom (int x,int y,int height,int width,Graphics g){
        g.drawRect(x,y,height,width);
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