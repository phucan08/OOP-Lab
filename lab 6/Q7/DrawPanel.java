import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class DrawPanel extends JPanel {
    private Random random = new Random();

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int panelWidth = getWidth();
        int panelHeight = getHeight();

        for (int i = 0; i < 10; i++) {
            // Random màu
            int red = random.nextInt(256);
            int green = random.nextInt(256);
            int blue = random.nextInt(256);
            g.setColor(new Color(red, green, blue));

            int width = random.nextInt(panelWidth / 2) + 1;
            int height = random.nextInt(panelHeight / 2) + 1;

            int x = random.nextInt(Math.max(1, panelWidth - width));
            int y = random.nextInt(Math.max(1, panelHeight - height));

            if (random.nextBoolean()) {
                g.fillRect(x, y, width, height);
            } else {
                g.fillOval(x, y, width, height);
            }
        }
    }
}
