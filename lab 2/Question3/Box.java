import java.util.ArrayList;
import java.util.Random;

public class Box {
    private int width;
    private int height;
    private ArrayList<Particle> particles;
    private static Box instance;  // Singleton
    private static Random random = new Random();

    // Private Constructor (Singleton Pattern)
    private Box(int width, int height) {
        this.width = width;
        this.height = height;
        this.particles = new ArrayList<>();
        // Khởi tạo 3 hạt ngẫu nhiên
        for (int i = 0; i < 3; i++) {
            particles.add(new Particle(random.nextInt(width), random.nextInt(height)));
        }
    }

    // Phương thức Singleton để lấy instance của Box
    public static Box getInstance(int width, int height) {
        if (instance == null) {
            instance = new Box(width, height);
        }
        return instance;
    }

    // Di chuyển tất cả các hạt
    public void moveParticles() {
        for (Particle particle : particles) {
            particle.move(width, height);
        }
        handleCollisions();
    }

    // Xử lý va chạm giữa các hạt
    private void handleCollisions() {
        ArrayList<Particle> newParticles = new ArrayList<>();
        for (int i = 0; i < particles.size(); i++) {
            for (int j = i + 1; j < particles.size(); j++) {
                if (particles.get(i).getX() == particles.get(j).getX() &&
                    particles.get(i).getY() == particles.get(j).getY()) {
                    // Thêm một hạt mới ngẫu nhiên
                    newParticles.add(new Particle(random.nextInt(width), random.nextInt(height)));
                }
            }
        }
        particles.addAll(newParticles);
    }

    // Hiển thị hộp với các hạt
    public void displayBox() {
        System.out.println("Particles in the box:");
        for (Particle particle : particles) {
            System.out.println(particle);
        }
    }

    // Trả về số lượng hạt trong hộp
    public int getParticleCount() {
        return particles.size();
    }
}

