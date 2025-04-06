import java.util.Scanner;

public class TriangleVerification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input sides from the user
        System.out.println("Please enter 3 numbers for the sides of a triangle:");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        // Create Triangle object
        Triangle triangle = new Triangle(side1, side2, side3);

        // Verify and display result
        System.out.println(triangle.verify());
    }
}