import javax.swing.JFrame;

public class DrawFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Drawing Lines Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400); 
        frame.add(new DrawPanel()); 
        frame.setVisible(true); 
    }
}