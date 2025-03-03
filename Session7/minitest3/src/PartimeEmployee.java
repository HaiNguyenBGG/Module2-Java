public class PartimeEmployee extends Employee {
    private int timeWorked;

    public PartimeEmployee(String id, String name, int age, String phoneNumber, String email, int timeWorked) {
        super(id, name, age, phoneNumber, email);
        this.timeWorked = timeWorked;
    }

    @Override
    public int getSalary() {
        return timeWorked * 100000;
    }

    @Override
    public String toString() {
        return "PartimeEmployee{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", timeWorked=" + timeWorked +
                ", salary=" + getSalary() +
                '}';

    }
}
