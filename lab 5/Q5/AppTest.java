import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AppTest {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            Project project = new Project("P001", sdf.parse("01/01/2025"), sdf.parse("31/12/2025"), ProjectPriority.HIGH);

            project.addEmployee(new Employee("E001", "Alice", 15, 1, 5));
            project.addEmployee(new Employee("E002", "Bob", 20, 0, 3));
            project.addEmployee(new Employee("E003", "Charlie", 18, 2, 2));

            System.out.println("Estimated Budget: " + project.estimateBudget());
            project.printEmployees();

            TaskManager taskManager = new TaskManager();
            taskManager.assignTask(project.getEmployees().get(0), "Software Development");
            taskManager.assignTask(project.getEmployees().get(1), "Testing");
            taskManager.displayTasks();

            ProjectStatusReport report = new ProjectStatusReport(project);
            report.generateReport();

            DeadlineTracker tracker = new DeadlineTracker(project);
            tracker.checkDeadlineApproaching();

            Thread thread = new Thread(new ProjectPrinter(project));
            thread.start();

        } catch (ParseException e) {
            System.out.println("Error parsing date: " + e.getMessage());
        }
    }
}