public class Square extends Rectangle {

    // No-argument constructor
    public Square() {
        super(1.0, 1.0);
    }

    // Constructor with side parameter
    public Square(double side) {
        super(side, side);
    }

    // Constructor with all parameters
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    // Getter and Setter for side
    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    // Override setWidth and setLength to ensure square geometry
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    // toString() method
    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}