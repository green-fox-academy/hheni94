import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.

        Random random = new Random();
        int randomColor = random.nextInt(255);
        int x = 0;
        int y = 0;
        int width = 0;
        int height = 0;

        for (int i = 0; i < 4; i++) {
            x = random.nextInt(320);
            y = random.nextInt(320);
            width = random.nextInt(320);
            height = random.nextInt(320);

            graphics.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255), random.nextInt(255)));
            graphics.fillRect(x, y, width, height);
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
