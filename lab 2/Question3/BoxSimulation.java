public class BoxSimulation {
    public static void main(String[] args) {
        // Tạo một hộp có kích thước cố định
        Box box = Box.getInstance(10, 10);  // Kích thước 10x10

        for (int step = 1; step <= 10; step++) {  // Chạy 10 bước
            System.out.println("Step: " + step);
            box.moveParticles();
            box.displayBox();
            System.out.println("Number of particles: " + box.getParticleCount());
            System.out.println("-----------------------------------");
        }
    }
}
