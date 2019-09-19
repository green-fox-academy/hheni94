import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3d {
    public static void mainDraw(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/assets/r4.png]

        int x = 15;
        int y = 15;
        int size = 15;

        for (int i = 0; i < 6; i ++) {
            x += size;
            y += size;
            size += 15; //Így először az x-et és az y-t növeli először és utána a size-ot. Ha a size kerülne az x és y elé akkor először növelné meg a méretét és csak utána kezdené el az x-et és y-t növelni.

            graphics.setColor(Color.BLACK);
            graphics.drawRect(x, y, size, size);
            graphics.setColor(new Color(153, 50, 204));
            graphics.fillRect(x, y, size, size);
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
            mainDraw(graphics);
        }
    }
}