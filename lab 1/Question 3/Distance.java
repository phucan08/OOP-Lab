import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first point coordinates
        System.out.println("Enter the first point x and y:");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        // Input second point coordinates
        System.out.println("Enter the second point x and y:");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        // Create Point objects
        Point point1 = new Point(x1, y1);
        Point point2 = new Point(x2, y2);

        // Calculate and display distance
        System.out.printf("The distance between the two points is: %.2f%n", point1.distance(point2));
    }
}