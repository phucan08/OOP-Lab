import javax.swing.*;

public class DrawFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Bar Chart Drawing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        DrawPanel panel = new DrawPanel();
        frame.add(panel);

        frame.setVisible(true);
    }
}
