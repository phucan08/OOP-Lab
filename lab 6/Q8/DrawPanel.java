import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    private int[] values = new int[5]; 

    public DrawPanel() {
        for (int i = 0; i < values.length; i++) {
            String input = JOptionPane.showInputDialog("Enter integer #" + (i + 1) + ":");
            try {
                values[i] = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                // Nếu nhập sai thì set thành 0
                values[i] = 0;
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int panelWidth = getWidth();
        int panelHeight = getHeight();


        int barWidth = panelWidth / values.length; 
        for (int i = 0; i < values.length; i++) {
            int barHeight = values[i] * 10; 

            
            int x = i * barWidth;
            int y = panelHeight - barHeight;

            
            g.setColor(new Color(
                    (i * 50) % 256,
                    (i * 100) % 256,
                    (i * 150) % 256
            ));

            g.fillRect(x, y, barWidth - 5, barHeight); 
        }
    }
}
