public class TestResizableCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println(circle);
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());

        ResizableCircle resizableCircle = new ResizableCircle(10);
        System.out.println(resizableCircle);
        resizableCircle.resize(50); // Resize to 50% of the current radius
        System.out.println("After resizing: " + resizableCircle);
        System.out.println("ResizableCircle Area: " + resizableCircle.getArea());
        System.out.println("ResizableCircle Perimeter: " + resizableCircle.getPerimeter());
    }
}