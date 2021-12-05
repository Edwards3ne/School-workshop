import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DrawCheckerboard {
    public static void drawImage(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern
        checkerBoard(graphics);



    }
    public static void checkerBoard(Graphics g){
        int x=0;
        int y=0;
        for (int i = 0; i <16 ; i++) {

            for (int j = 0; j < 16; j++) {
                g.fillRect(x,y,20,20);
                x+=40;
            }
            if (i%2==0){
                x=20;
            }else {
                x=0;
            }


            y+=20;
        }


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