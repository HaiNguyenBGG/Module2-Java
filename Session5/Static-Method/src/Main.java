public class Main {
    public static void main(String[] args) {
        Student.change();
        Student student = new Student(1, "Nguyen Van A", "nguyenvana@gm.com", "Hue");
        Student student1 = new Student(2, "Nguyen Van B", "nguyenvanb@gm.com", "DaNang");
        Student student2 = new Student(3, "Nguyen Van C", "nguyenvanc@gm.com", "HCM");

        student.display();
        student1.display();
        student2.display();
    }
}