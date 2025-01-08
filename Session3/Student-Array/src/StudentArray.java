import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {
        String[] students = {"Hải Nguyễn", "An", "Chu Hải"};
        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println("List of students:");
            for (int i = 0; i < students.length; i++) {
                System.out.println((i + 1) + ". " + students[i]);
            }

            System.out.print("\nEnter the name of the student to search for (or type 'exit' to quit): ");
            String name = sc.nextLine().trim();

            if (name.equalsIgnoreCase("exit")) {
                System.out.println("The program has ended. Goodbye!");
                break;
            }

            int position = findStudentIndex(students, name);

            if (position != -1) {
                System.out.println("Student \"" + name + "\" ranked at " + (position + 1) + " in the list.");
            } else {
                System.out.println("Student not found \"" + name + "\" in the list.");
            }
            System.out.println("Enter to continue...");
            sc.nextLine();
        }
        sc.close();
    }

    public static int findStudentIndex(String[] students, String name) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }
}
