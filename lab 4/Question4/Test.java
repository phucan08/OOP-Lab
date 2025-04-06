public class Test {
    public static void main(String[] args) {
        Student student = new Student("Chi Bao", "123 HBT st", "Computer Science", 2023, 45000000.0);
        Staff staff = new Staff("Minh Long", "456 CMT8 St", "HCMIU", 5000000.0);

        System.out.println(student);
        System.out.println(staff);

        student.setYear(2024);
        student.setFee(16000000);
        System.out.println("Updated Student: " + student);

        staff.setPay(55000.0);
        System.out.println("Updated Staff: " + staff);
    }
}