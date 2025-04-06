public class Rectangle {
    private int width;
    private int height;

    // Constructor with validation
    public Rectangle(int width, int height) {
        if (width < 0) {
            System.out.println("Warning: input width is negative!");
            this.width = 1; // Default value
        } else {
            this.width = width;
        }
        if (height < 0) {
            System.out.println("Warning: input height is negative!");
            this.height = 1; // Default value
        } else {
            this.height = height;
        }
    }

    // Getter methods
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    // Visualize method
    public void visualize() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
