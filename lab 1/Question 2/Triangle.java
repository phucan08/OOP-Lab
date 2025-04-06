public class Triangle {
    private int side1, side2, side3;

    // Constructor
    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Getter Methods
    public int getSide1() {
        return side1;
    }

    public int getSide2() {
        return side2;
    }

    public int getSide3() {
        return side3;
    }

    // Verify and classify triangle type
    public String verify() {
        // Check if it's a valid triangle
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            return "Not Triangle";
        }
        // Check for Equilateral Triangle
        else if (side1 == side2 && side2 == side3) {
            return "Equilateral Triangle";
        }
        // Check for Isosceles Triangle
        else if (side1 == side2 || side1 == side3 || side2 == side3) {
            return "Isosceles Triangle";
        }
        // Otherwise, it's a Scalene Triangle
        else {
            return "Scalene Triangle";
        }
    }
}