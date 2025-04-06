public class TestShape {
    public static void main(String[] args) {
        // Test Shape
        Shape shape = new Shape("blue", false);
        System.out.println(shape);

        // Test Circle
        Circle circle = new Circle(5.5, "green", true);
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        // Test Rectangle
        Rectangle rectangle = new Rectangle(4.0, 6.0, "yellow", false);
        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        // Test Square
        Square square = new Square(3.0, "red", true);
        System.out.println(square);
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());

        // Testing overridden methods for Square
        square.setSide(4.5);
        System.out.println("Updated Square: " + square);
    }
}