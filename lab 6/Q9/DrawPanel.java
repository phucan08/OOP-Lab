import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;

public class DrawPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        int maxRadius = Math.min(getWidth(), getHeight()) / 2;

        // Vẽ các vòng tròn từ ngoài vào
        int[] radii = {
                maxRadius,
                (int)(maxRadius * 0.8),
                (int)(maxRadius * 0.6),
                (int)(maxRadius * 0.4),
                (int)(maxRadius * 0.2)
        };
        Color[] colors = {
                Color.RED,
                Color.WHITE,
                Color.RED,
                Color.WHITE,
                Color.BLUE
        };

        for (int i = 0; i < radii.length; i++) {
            int radius = radii[i];
            int diameter = radius * 2;
            g2d.setColor(colors[i]);
            g2d.fillOval(centerX - radius, centerY - radius, diameter, diameter);
        }

        // Vẽ ngôi sao trắng ở giữa
        g2d.setColor(Color.WHITE);
        drawStar(g2d, centerX, centerY, maxRadius * 0.2, maxRadius * 0.08);
    }

    private void drawStar(Graphics2D g2d, int centerX, int centerY, double outerRadius, double innerRadius) {
        Path2D star = new Path2D.Double();
        int points = 5;
        double angle = Math.PI / points;

        for (int i = 0; i < 2 * points; i++) {
            double r = (i % 2 == 0) ? outerRadius : innerRadius;
            double x = centerX + r * Math.sin(i * angle);
            double y = centerY - r * Math.cos(i * angle);
            if (i == 0) {
                star.moveTo(x, y);
            } else {
                star.lineTo(x, y);
            }
        }
        star.closePath();
        g2d.fill(star);
    }
}
