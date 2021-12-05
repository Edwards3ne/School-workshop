import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DrawSuperHexagon {
    public static void drawImage(Graphics graphics) {
        int[] xs = {20, 40, 50, 40, 20, 10};
        int[] ys = {30, 30, 45, 60, 60, 45};
        int[] xst = new int[6];
        int[] yst = new int[6];
        //fill count
        for (int f = 0; f < 6; f++) {
            xst[f] = xs[f] + 60;

        }
        for (int l = 0; l < 6; l++) {
            yst[l] = ys[l] + 15;
        }
        //
        for (int o = 0; o < 5; o++) {
            for (int i = 0; i < 4; i++) {
                for (int f = 0; f < 6; f++) {
                    xst[f] = xst[f] + 60;
                }
                graphics.drawPolygon(xst, yst, 6);
            }
            for (int j = 0; j < 6; j++) {
                yst[j] = yst[j] + 30;
            }

            for (int f = 0; f < 6; f++) {
                xst[f] = xs[f] + 60;
            }
        }


        for (int l = 0; l < 6; l++) {
            yst[l] = ys[l] + 15;
        }
        for (int j = 0; j < 6; j++) {
            yst[j] = yst[j] + 15;
        }
        for (int f = 0; f < 6; f++) {
            xst[f] = xst[f] + 30;
        }

        for (int o = 0; o < 5; o++) {
            for (int i = 0; i < 3; i++) {
                for (int f = 0; f < 6; f++) {
                    xst[f] = xst[f] + 60;
                }

                graphics.drawPolygon(xst, yst, 6);
            }
            for (int j = 0; j < 6; j++) {
                yst[j] = yst[j] + 30;
            }

            for (int f = 0; f < 6; f++) {
                xst[f] = xs[f] + 60;
            }
            for (int f = 0; f < 6; f++) {
                xst[f] = xst[f] + 30;
            }

        }
        for (int f = 0; f < 6; f++) {
            xst[f] = xs[f] + 60;
        }

        for (int l = 0; l < 6; l++) {
            yst[l] = ys[l] + 15;
        }
        for (int j = 0; j < 6; j++) {
            yst[j] = yst[j] - 15;
        }

        for (int f = 0; f < 6; f++) {
            xst[f] = xst[f] + 30;
        }
        for (int i = 0; i < 3; i++) {
            for (int f = 0; f < 6; f++) {
                xst[f] = xst[f] + 60;
            }

            graphics.drawPolygon(xst, yst, 6);
        }
        for (int j = 0; j < 6; j++) {
            yst[j] = yst[j] - 15;
        }
        for (int f = 0; f < 6; f++) {
            xst[f] = xs[f] + 60;
        }
        for (int f = 0; f < 6; f++) {
            xst[f] = xst[f] + 60;
        }
        for (int i = 0; i < 2; i++) {
            for (int f = 0; f < 6; f++) {
                xst[f] = xst[f] + 60;
            }

            graphics.drawPolygon(xst, yst, 6);
        }
        for (int f = 0; f < 6; f++) {
            xst[f] = xs[f] + 60;
        }
        for (int f = 0; f < 6; f++) {
            xst[f] = xst[f] + 90;
        }
        for (int j = 0; j < 6; j++) {
            yst[j] = yst[j] - 15;
        }

        for (int i = 0; i < 1; i++) {
            for (int f = 0; f < 6; f++) {
                xst[f] = xst[f] + 60;
            }

            graphics.drawPolygon(xst, yst, 6);
        }
        for (int f = 0; f < 6; f++) {
            xst[f] = xs[f] + 60;
        }
        for (int l = 0; l < 6; l++) {
            yst[l] = ys[l] + 15;
        }
        for (int j = 0; j < 6; j++) {
            yst[j] = yst[j] + 150;
        }
        for (int f = 0; f < 6; f++) {
            xst[f] = xst[f] + 60;
        }

        for (int i = 0; i < 2; i++) {
            for (int f = 0; f < 6; f++) {
                xst[f] = xst[f] + 60;
            }

            graphics.drawPolygon(xst, yst, 6);
        }
        for (int j = 0; j < 6; j++) {
            yst[j] = yst[j] + 30;
        }

        for (int f = 0; f < 6; f++) {
            xst[f] = xst[f] - 30;
        }
        for (int j = 0; j < 6; j++) {
            yst[j] = yst[j] - 15;
        }
        graphics.drawPolygon(xst, yst, 6);
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