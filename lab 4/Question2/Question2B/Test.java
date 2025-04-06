public class Test {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "red", false);
        System.out.println(s1);
        System.out.println("Area: " + s1.getArea());
        System.out.println("Perimeter: " + s1.getPerimeter());
        System.out.println("Color: " + s1.getColor());
        System.out.println("Filled: " + s1.isFilled());

        Circle c1 = (Circle) s1;
        System.out.println(c1);
        System.out.println("Radius: " + c1.getRadius());

        Shape s2 = new Rectangle(1.0, 2.0, "blue", true);
        System.out.println(s2);
        System.out.println("Area: " + s2.getArea());
        System.out.println("Perimeter: " + s2.getPerimeter());

        Shape s3 = new Square(6.0, "yellow", false);
        System.out.println(s3);
        System.out.println("Area: " + s3.getArea());
        System.out.println("Side" + ((Square) s3).getSide());
    }
}