import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();
        int steps = 15; 
        int stepWidth = width / steps;
        int stepHeight = height / steps;

        int i = 0;

        while (i <= steps) {
            int startX = 0;
            int startY = i * stepHeight;
            int endX = i * stepWidth;
            int endY = height;

            g.drawLine(startX, startY, endX, endY);
            i++;
        }
    }
}
