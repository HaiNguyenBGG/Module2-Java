public class FulltimeEmployee extends Employee {
    private int salary;
    private int bonus;
    private int fine;

    public FulltimeEmployee(String id, String name, int age, String phoneNumber, String email, int salary, int bonus, int fine) {

        super(id, name, age, phoneNumber, email);
        this.salary = salary;
        this.bonus = bonus;
        this.fine = fine;
    }

    @Override
    public int getSalary() {
        return salary + bonus - fine;
    }

    @Override
    public String toString() {
        return "FulltimeEmployee{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", salary=" + salary +
                ", bonus=" + bonus +
                ", fine=" + fine +
                ", salary=" + getSalary() +
                '}';
    }
}
