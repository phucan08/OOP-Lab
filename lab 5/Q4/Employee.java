import java.util.Objects;

public class Employee implements Comparable<Employee> {
    private String employeeId;
    private String employeeName;
    private int salaryPerHour;
    private int noOfLeavingDay;
    private int noOfTravelDay;

    public Employee(String employeeId, String employeeName, int salaryPerHour, int noOfLeavingDay, int noOfTravelDay) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salaryPerHour = salaryPerHour;
        this.noOfLeavingDay = noOfLeavingDay;
        this.noOfTravelDay = noOfTravelDay;
    }

    public int calculateWeeklySalary() {
        return salaryPerHour * 8 * (5 - noOfLeavingDay + noOfTravelDay / 2);
    }

    @Override
    public int compareTo(Employee other) {
        if (this.noOfTravelDay != other.noOfTravelDay) {
            return other.noOfTravelDay - this.noOfTravelDay; // Travel days: Higher is better.
        } else {
            return this.noOfLeavingDay - other.noOfLeavingDay; // Leaving days: Lower is better.
        }
    }

    @Override
    public String toString() {
        return "[Name=" + employeeName + ", Salary Per Hour=" + salaryPerHour +
               ", Weekly Salary=" + calculateWeeklySalary() + "]";
    }
}