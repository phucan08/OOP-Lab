import javax.swing.JPanel;
import java.awt.Graphics;

public class DrawPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();
        int steps = 15; // Number of divisions

        // Draw lines fanning out from the top-left corner
        for (int i = 0; i <= steps; i++) {
            int x = i * width / steps; // Horizontal increment
            int y = i * height / steps; // Vertical increment
            
            g.drawLine(0, 0, x, height); // Lines from top-left to bottom edge
            g.drawLine(0, 0, width, y);  // Lines from top-left to right edge
        }
    }
}