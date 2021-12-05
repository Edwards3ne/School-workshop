import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class DrawLinePlayQuarters2 {
    public static void drawImage(Graphics graphics) {




        drawLinePlay(HEIGHT/4,WIDTH/4,graphics);


    }
    public static void drawLine(int x1,int y1,int x2,int y2,Graphics g){
        g.drawLine(x1,y1,x2,y2);
    }
    public static void drawLinePlay(int height,int width,Graphics g){
        int hei=height/16;
        int wid=width/16;
        // first quarter
        g.setColor(Color.BLUE);
        for (int i = 0; i <= 14; i++) {
            drawLine(0+((2+i)*hei),0,height,0+((1+i)*wid),g);

        }
        g.setColor(Color.GREEN);
        for (int i = 0; i <= 14; i++) {
            drawLine(0,0+((2+i)*wid),0+((1+i)*hei),width,g);

        }
        //second quarter
        g.setColor(Color.BLUE);
        for (int i = 0; i <= 14; i++) {
            drawLine(height+((2+i)*hei),0,height*2,0+((1+i)*wid),g);

        }
        g.setColor(Color.GREEN);
        for (int i = 0; i <= 14; i++) {
            drawLine(height,0+((2+i)*wid),height+((1+i)*hei),width,g);

        }
        //third quarter

        g.setColor(Color.BLUE);
        for (int i = 0; i <= 14; i++) {
            drawLine(0+((2+i)*hei),width,height,width+((1+i)*wid),g);

        }
        g.setColor(Color.GREEN);
        for (int i = 0; i <= 14; i++) {
            drawLine(0,width+((2+i)*wid),0+((1+i)*hei),width*2,g);

        }
        //fourth quarter
        g.setColor(Color.BLUE);
        for (int i = 0; i <= 14; i++) {
            drawLine(height+((2+i)*hei),width,height*2,width+((1+i)*wid),g);

        }
        g.setColor(Color.GREEN);
        for (int i = 0; i <= 14; i++) {
            drawLine(height,width+((2+i)*wid),height+((1+i)*hei),width*2,g);

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
