import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FractalsTriangles {
    public static void drawImage(Graphics graphics) {
        DrawTriangles(graphics,20,20,640,2);

    }
    public static void DrawTriangles(Graphics g,double x,double y,double side,int count){
        if (side<= 1){
            return;
        }

        //            double x1 = x + (r * Math.cos(Math.toRadians(angle)));
        //            double y1 = y + (r * Math.sin(Math.toRadians(angle)));

        double x2=x+side;
        double y2 =y;
        double x3=x + (side * Math.cos(Math.toRadians(60)));
        double y3=y + (side * Math.sin(Math.toRadians(60)));


      //  g.setColor(new Color(135+25,100+20,10+25));

        DrawTriangles(g,x,y,side/2,count+2);
        DrawTriangles(g,x+side/2,y,side/2,count+3);
        DrawTriangles(g,x+(x3-x)/2,y+(y3-y)/2,side/2,count+4);

        g.setColor(new Color(count*2,count*3,count*5));
        g.drawLine((int)x,(int)y,(int)x2,(int)y2);
        g.drawLine((int)x2,(int)y2,(int)x3,(int)y3);
        g.drawLine((int)x3,(int)y3,(int)x,(int)y);


    }

    // Don't touch the code below
    static int WIDTH = 640;
    static int HEIGHT = 640;

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
