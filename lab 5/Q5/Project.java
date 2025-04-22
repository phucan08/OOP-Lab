import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Project {
    private String projectId;
    private Date startDate;
    private Date endDate;
    private List<Employee> employees;
    private ProjectPriority priority;

    public Project(String projectId, Date startDate, Date endDate, ProjectPriority priority) {
        this.projectId = projectId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.priority = priority;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public int estimateBudget() {
        int totalBudget = 0;
        for (Employee employee : employees) {
            totalBudget += employee.calculateWeeklySalary();
        }
        return totalBudget;
    }

    public Date getEndDate() {
        return endDate;
    }

    @Override
    public String toString() {
        return "[Project ID=" + projectId + ", Priority=" + priority + ", Duration=" + startDate + " to " + endDate + "]";
    }

    public void printEmployees() {
        System.out.println(this);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}