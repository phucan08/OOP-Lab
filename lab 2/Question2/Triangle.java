public class Triangle {
    private Point2D p1;
    private Point2D p2;
    private Point2D p3;

    // Constructor để khởi tạo tam giác với ba đỉnh
    public Triangle(Point2D p1, Point2D p2, Point2D p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    // Phương thức tính chu vi tam giác
    public double perimeter() {
        double side1 = Point2D.distance(p1, p2);
        double side2 = Point2D.distance(p2, p3);
        double side3 = Point2D.distance(p3, p1);
        return side1 + side2 + side3;
    }

    // Phương thức tính diện tích tam giác
    public double area() {
        double side1 = Point2D.distance(p1, p2);
        double side2 = Point2D.distance(p2, p3);
        double side3 = Point2D.distance(p3, p1);
        double semiPerimeter = (side1 + side2 + side3) / 2; // Chu vi bán phần
        return Math.sqrt(semiPerimeter *
                         (semiPerimeter - side1) *
                         (semiPerimeter - side2) *
                         (semiPerimeter - side3)); // Công thức Heron
    }

    @Override
    public String toString() {
        return "Triangle vertices: " + p1 + ", " + p2 + ", " + p3;
    }
}
