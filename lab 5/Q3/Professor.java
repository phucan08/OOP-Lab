public class Professor extends Staff {
    private String field;

    public Professor(String name, String address, String school, double pay, String field) {
        super(name, address, school, pay);
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    @Override
    public void displayInfo() {
        System.out.println("Professor[" + super.toString() + ", field=" + field + "]");
    }

    @Override
    public String toString() {
        return "Professor[Staff[Person[name=" + getName() + ", address=" + getAddress() + 
            "], school=" + getSchool() + ", pay=" + getPay() + "], field=" + field + "]";
    }
}