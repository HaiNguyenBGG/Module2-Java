import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        double width, height, bmi;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số cân nặng (kg): ");
        width = scanner.nextDouble();

        System.out.println("Nhập số chiều cao (cm): ");
        height = scanner.nextDouble();

        bmi = width / Math.pow(height / 100, 2);

        String status;
        if (bmi < 18) {
            status = "Gầy";
        } else if (bmi < 25.0) {
            status = "Bình thường";
        } else if (bmi < 30.0) {
            status = "Béo";
        } else {
            status = "Béo Phì";
        }

        System.out.printf("BMI là: %-20.2f%s%n", bmi, status);
    }
}

