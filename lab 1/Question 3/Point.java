public class Point {
    private double x, y;

    // Constructor to initialize coordinates
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getter methods
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Method to calculate distance to another point
    public double distance(Point target) {
        return Math.sqrt(Math.pow(this.x - target.getX(), 2) + Math.pow(this.y - target.getY(), 2));
    }
}