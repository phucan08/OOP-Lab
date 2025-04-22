import java.util.HashMap;
import java.util.Map;

public class TaskManager {
    private Map<Employee, String> taskAssignments;

    public TaskManager() {
        taskAssignments = new HashMap<>();
    }

    public void assignTask(Employee employee, String task) {
        taskAssignments.put(employee, task);
    }

    public void displayTasks() {
        for (Map.Entry<Employee, String> entry : taskAssignments.entrySet()) {
            System.out.println(entry.getKey().getEmployeeName() + " -> Task: " + entry.getValue());
        }
    }
}