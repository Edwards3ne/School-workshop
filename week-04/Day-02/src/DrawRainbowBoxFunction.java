import javax.print.attribute.standard.PresentationDirection;
import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DrawRainbowBoxFunction {
    public static void drawImage(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters
        // (the square size, the fill color and the graphics)
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).
        Random ran = new Random();
        int size ;
        HashMap<Integer,String> collors = new HashMap<>();
        collors.put(6,"red");
        collors.put(5,"orange");
        collors.put(4,"yellow");
        collors.put(3,"green");
        collors.put(2,"blue");
        collors.put(1,"indigo");
        collors.put(0,"violet");
        size = 300;
        for (int i = 6; i >= 0; i--) {

            square(size,collors.get(i),graphics);
            size -= 30;
        }

    }
    public static void square(int size,String colorType,Graphics g){
        if (colorType == "red"){
            g.setColor(Color.RED);
        }
        if (colorType == "orange"){
            g.setColor(Color.orange);
        }
        if (colorType == "yellow"){
            g.setColor(Color.yellow);
        }
        if (colorType == "green"){
            g.setColor(Color.green);
        }
        if (colorType == "blue"){
            g.setColor(Color.blue);
        }
        if (colorType == "indigo"){
            g.setColor(new Color(75, 0, 130));
        }
        if (colorType == "violet"){
            g.setColor(new Color(238,130,238));
        }
         g.fillRect(HEIGHT/2-(size/2/2),WIDTH/2-(size/2/2),size/2,size/2);
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