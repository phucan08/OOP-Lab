public class Point2D {
    private int x;
    private int y;

    // Constructor 1: Initialize point at origin (0, 0)
    public Point2D() {
        this.x = 0;
        this.y = 0;
    }

    // Constructor 2: Initialize point with given x and y coordinates
    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Constructor 3: Initialize point at the position of another point
    public Point2D(Point2D p) {
        this.x = p.x;
        this.y = p.y;
    }

    // Input method: Allow user to enter coordinates
    public void input() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter X: ");
        this.x = scanner.nextInt();
        System.out.print("Enter Y: ");
        this.y = scanner.nextInt();
    }

    // Method to return a string representation of the point
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // Method to move point to new coordinates
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to check if the point is at origin (0, 0)
    public boolean isOrigin() {
        return this.x == 0 && this.y == 0;
    }

    // Method to calculate the distance from this point to another point
    public double distance(Point2D p) {
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }

    // Static method to calculate the distance between two points
    public static double distance(Point2D p1, Point2D p2) {
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }
}
