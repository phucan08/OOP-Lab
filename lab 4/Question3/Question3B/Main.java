public class Main {
    public static void main(String[] args) {
       
        Circle circle = new Circle(10);
        System.out.println(circle); 
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        ResizableCircle resizableCircle = new ResizableCircle(10);
        System.out.println(resizableCircle);
        System.out.println("Area: " + resizableCircle.getArea());
        System.out.println("Perimeter: " + resizableCircle.getPerimeter());

        resizableCircle.resize(50); 
        System.out.println("After resizing:");
        System.out.println(resizableCircle);
        System.out.println("Area: " + resizableCircle.getArea());
        System.out.println("Perimeter: " + resizableCircle.getPerimeter());
    }
}