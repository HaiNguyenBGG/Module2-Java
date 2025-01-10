import javax.xml.namespace.QName;

public class Student {
    private int msv;
    private String name;
    private String mail;
    private String address;
    private static String school = "RMIT";

    Student(int msv, String name, String mail, String address) {
        this.msv = msv;
        this.name = name;
        this.mail = mail;
        this.address = address;
    }

    static void change() {
        school = "UNETI";
    }

    void display() {
        System.out.println(msv + " " + name + " " + mail + " " + address + " " + school);
    }
}
