import java.util.Date;

public class DeadlineTracker {
    private Project project;

    public DeadlineTracker(Project project) {
        this.project = project;
    }

    public void checkDeadlineApproaching() {
        Date today = new Date();
        long timeLeft = project.getEndDate().getTime() - today.getTime();
        long daysLeft = timeLeft / (1000 * 60 * 60 * 24);

        if (daysLeft <= 7) {
            System.out.println("Warning: Project '" + project + "' is nearing its deadline! " + daysLeft + " days remaining.");
        } else {
            System.out.println("Project '" + project + "' deadline is in " + daysLeft + " days.");
        }
    }
}