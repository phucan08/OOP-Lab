public class ProjectPrinter implements Runnable {
    private Project project;

    public ProjectPrinter(Project project) {
        this.project = project;
    }

    @Override
    public void run() {
        for (Employee employee : project.getEmployees()) {
            System.out.println(employee);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}