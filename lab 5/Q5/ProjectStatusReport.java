public class ProjectStatusReport {
    private Project project;

    public ProjectStatusReport(Project project) {
        this.project = project;
    }

    public void generateReport() {
        System.out.println("Project Report for: " + project);
        System.out.println("Estimated Budget: " + project.estimateBudget());
        project.printEmployees();
    }
}