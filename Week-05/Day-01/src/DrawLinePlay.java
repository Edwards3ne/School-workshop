import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DrawLinePlay {
    public static void drawImage(Graphics graphics) {
        int hei=HEIGHT/16;
        int wid=WIDTH/16;
        graphics.setColor(Color.BLUE);
        for (int i = 0; i <= 14; i++) {
            drawLine(hei*(2+i),0,HEIGHT,wid*(1+i),graphics);

        }
        graphics.setColor(Color.GREEN);
        for (int i = 0; i <= 14; i++) {
            drawLine(0,wid*(2+i),hei*(1+i),WIDTH,graphics);

        }



    }
    public static void drawLine(int x1,int y1,int x2,int y2,Graphics g){
        g.drawLine(x1,y1,x2,y2);
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