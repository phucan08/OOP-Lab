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
        // Top-left corner
        while (i <= steps) {
            g.drawLine(0, i * stepHeight, i * stepWidth, height);
            i++;
        }

        i = 0;
        // Top-right corner
        while (i <= steps) {
            g.drawLine(width, i * stepHeight, width - i * stepWidth, height);
            i++;
        }

        i = 0;
        // Bottom-left corner
        while (i <= steps) {
            g.drawLine(0, height - i * stepHeight, i * stepWidth, 0);
            i++;
        }

        i = 0;
        // Bottom-right corner
        while (i <= steps) {
            g.drawLine(width, height - i * stepHeight, width - i * stepWidth, 0);
            i++;
        }
    }
}
