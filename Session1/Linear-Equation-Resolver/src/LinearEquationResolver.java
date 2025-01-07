import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        double a, b, c;

        System.out.println("Cho trương chình a * x + b = c");
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập a: ");
        a = scanner.nextDouble();
        System.out.printf("Nhập b: ");
        b = scanner.nextDouble();
        System.out.printf("Nhập c: ");
        c = scanner.nextDouble();

        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Phương trình có nghiệm x = %f!\n", answer);
        } else {
            if (b == c) {
                System.out.println("Phương trình vô số nghiệm!");
            } else {
                System.out.println("Phương trình vô nghiệm!");
            }
        }

    }
}
