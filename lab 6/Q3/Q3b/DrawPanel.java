import javax.swing.JPanel;
import java.awt.Graphics;

public class DrawPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();
        int steps = 15; 

        for (int i = 0; i <= steps; i++) {
            int x = i * width / steps;
            int y = i * height / steps;

            g.drawLine(0, 0, x, height);
            g.drawLine(0, 0, width, y);

            g.drawLine(width, 0, width - x, height);
            g.drawLine(width, 0, 0, y);

            g.drawLine(0, height, x, 0);
            g.drawLine(0, height, width, height - y);

            g.drawLine(width, height, width - x, 0);
            g.drawLine(width, height, 0, height - y);
        }
    }
}