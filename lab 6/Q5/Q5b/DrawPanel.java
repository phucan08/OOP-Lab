import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;

        int startRadius = 5; 
        int maxRadius = Math.min(centerX, centerY); 
        int deltaRadius = 1; 

        int startAngle = 0; 
        int arcAngle = 20; 

        int radius = startRadius;

        while (radius < maxRadius) {
            int x = centerX - radius;
            int y = centerY - radius;
            int diameter = 2 * radius;

            g2d.drawArc(x, y, diameter, diameter, startAngle, arcAngle);

            startAngle = (startAngle + arcAngle) % 360; 
            radius += deltaRadius; 
        }
    }
}
