import java.util.Random;

public class Particle {
    private int x;
    private int y;
    private static Random random = new Random();

    // Constructor
    public Particle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter cho vị trí
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Di chuyển hạt một cách ngẫu nhiên
    public void move(int boxWidth, int boxHeight) {
        // Các hướng di chuyển: [dx, dy]
        int[][] directions = {
            {0, -1},  // North
            {1, -1},  // North-East
            {1, 0},   // East
            {1, 1},   // South-East
            {0, 1},   // South
            {-1, 1},  // South-West
            {-1, 0},  // West
            {-1, -1}  // North-West
        };

        int[] chosenDirection = directions[random.nextInt(directions.length)];
        int newX = x + chosenDirection[0];
        int newY = y + chosenDirection[1];

        // Giữ hạt bên trong hộp
        if (newX >= 0 && newX < boxWidth) {
            x = newX;
        }
        if (newY >= 0 && newY < boxHeight) {
            y = newY;
        }
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
