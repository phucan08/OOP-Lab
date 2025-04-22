public class TestPerson {
    public static void main(String[] args) {
        
        Person person = new Person("Chi Bao", "CMT8 St");
        Student student = new Student("Minh Long", "NTMK St", "Computer Science", 1, 10000);
        Staff staff = new Staff("Brown", "No Name St", "International School", 5000);
        Professor professor = new Professor("Le Duy Tan", "A2.508", "International University", 7000, "Computer network");

        Person[] people = {person, student, staff, professor};

        for (Person p : people) {
            p.displayInfo();
        }
    }
}