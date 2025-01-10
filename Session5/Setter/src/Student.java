public class Student {
    private String name = "John Doe";
    public static String classes = "C02";

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    void Student() {

    }

    public void setName(String name) {
        this.name = name;
    }
    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }
}
