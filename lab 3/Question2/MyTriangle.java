import java.awt.geom.Point2D;
import java.util.Scanner;

public class MyTriangle {
    private Point2D vertex1;
    private Point2D vertex2;
    private Point2D vertex3;
    private int triangleType;

    // Constructor
    public MyTriangle(Point2D v1, Point2D v2, Point2D v3) {
        this.vertex1 = v1;
        this.vertex2 = v2;
        this.vertex3 = v3;
        this.triangleType = determineType();
    }

    // Method to determine the type of triangle
    private int determineType() {
        double side1 = vertex1.distance(vertex2);
        double side2 = vertex2.distance(vertex3);
        double side3 = vertex3.distance(vertex1);

        if (side1 == side2 && side2 == side3) {
            return 0; // Equilateral
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            return 1; // Isosceles
        } else {
            return 2; // Scalene
        }
    }

    // Getter for triangle type
    public String getType() {
        switch (this.triangleType) {
            case 0: return "equilateral";
            case 1: return "isosceles";
            default: return "scalene";
        }
    }
}