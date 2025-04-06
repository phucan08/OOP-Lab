import java.awt.geom.Point2D;
import java.util.Scanner;
class Lab3Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 6 values for 3 vertices:");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        Point2D p1 = new Point2D.Double(x1, y1);
        Point2D p2 = new Point2D.Double(x2, y2);
        Point2D p3 = new Point2D.Double(x3, y3);

        MyTriangle triangle = new MyTriangle(p1, p2, p3);
        System.out.println("Triangle is " + triangle.getType() + ".");
        
        scanner.close();
    }
}
