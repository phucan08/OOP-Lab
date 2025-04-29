import javax.swing.JPanel;
import java.awt.Graphics;

public class DrawPanel extends JPanel { 
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        
        int width = getWidth();
        int height = getHeight();

        g.drawLine(0, 0, width, height);      
        g.drawLine(0, height, width, 0);     
        g.drawLine(width / 2, 0, width / 2, height); 
        g.drawLine(0, height / 2, width, height / 2); 
    }
}