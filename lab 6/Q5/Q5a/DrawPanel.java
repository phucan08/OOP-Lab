import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;

        int length = 10; 
        int delta = 10;  

        int x = centerX;
        int y = centerY;

        int direction = 0; 

        int steps = 30; 

        int count = 0;

        while (count < steps) {
            int nextX = x;
            int nextY = y;

            switch (direction) {
                case 0: 
                    nextY += length;
                    break;
                case 1: 
                    nextX -= length;
                    break;
                case 2: 
                    nextY -= length;
                    break;
                case 3: 
                    nextX += length;
                    break;
            }

            g.drawLine(x, y, nextX, nextY);

            x = nextX;
            y = nextY;

            direction = (direction + 1) % 4; 

            if (direction == 0 || direction == 2) {
                length += delta;
            }

            count++;
        }
    }
}
