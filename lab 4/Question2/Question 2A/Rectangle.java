public class Rectangle extends Shape {
    private double width;
    private double length;

    // No-argument constructor
    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }

    // Constructor with width and length
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    // Constructor with all parameters
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    // Getters and Setters
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // Methods for area and perimeter
    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    // toString() method
    @Override
    public String toString() {
        return "Rectangle[" + super.toString() + ", width=" + width + ", length=" + length + "]";
    }
}
