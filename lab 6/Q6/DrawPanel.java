import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;

        int radiusIncrement = 10; 
        int numberOfCircles = 12; 

        for (int i = 1; i <= numberOfCircles; i++) {
            int radius = i * radiusIncrement;
            int diameter = 2 * radius;

            int topLeftX = centerX - radius;
            int topLeftY = centerY - radius;

            g.drawOval(topLeftX, topLeftY, diameter, diameter);
        }
    }
}
