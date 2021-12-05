import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DrawTriangles {
    public static void drawImage(Graphics graphics) {


        drawTriangle(440,graphics);


    }
    public static void drawLine(int x1,int y1,int x2,int y2,Graphics g){
        g.drawLine(x1,y1,x2,y2);
    }
    public static void drawTriangle(int size,Graphics g){
        int x = size/22;
        int y =0;
        for (int i = 0; i < 22; i++) {
            y= x*i;
            g.drawLine(0+(y/2),size-y,size-(y/2),size-y);

        }
        y =0;
        for (int i = 0; i < 22; i++) {
            y= x*i;
            g.drawLine(0+(y),size,size /2+(y/2),0+(y));

        }
        y =0;
        for (int i = 0; i < 22; i++) {
            y= x*i;
            g.drawLine(size-y,size,size /2-(y/2),0+(y));

        }
    }

    // Don't touch the code below
    static int WIDTH = 440;
    static int HEIGHT = 440;

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
