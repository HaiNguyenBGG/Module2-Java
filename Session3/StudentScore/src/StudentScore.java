import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] scores = new double[30];
        int numberOfStudent;

        System.out.print("Enter the number of students (maximum 30): ");
        while (true) {
            numberOfStudent = sc.nextInt();
            if (numberOfStudent > 0 && numberOfStudent <= 30) {
                break;
            }
            System.out.println("Invalid number of students! Please enter again (1 - 30):");

        }
        for (int i = 1; i <= numberOfStudent; i++) {
            System.out.printf("Enter the score for student %d (from 0 to 10): ", i);
            while (true) {
                scores[i] = sc.nextDouble();
                if (scores[i] >= 0 && scores[i] <= 10) {
                    break;
                }
                System.out.println("Invalid score! Please enter again (0 - 10): ");
            }
        }

        int count = 0;
        for (int i = 0; i <= numberOfStudent; i++) {
            if (scores[i] >= 5) {
                count++;
            }
        }
        System.out.println("Number of students who passed the exam: " + count);
    }
}
