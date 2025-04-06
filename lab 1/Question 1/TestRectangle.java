import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle[] rectangles = new Rectangle[5]; // Array to store 5 Rectangle objects

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter width for Rectangle " + (i + 1) + ": ");
            int width = scanner.nextInt();
            System.out.println("Enter height for Rectangle " + (i + 1) + ": ");
            int height = scanner.nextInt();

            rectangles[i] = new Rectangle(width, height);
        }

        System.out.println("\nVisualizing Rectangles:");
        for (Rectangle rectangle : rectangles) {
            rectangle.visualize();
            System.out.println(); // Separate visualizations for clarity
        }
    }
}
