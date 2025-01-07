import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = input.nextDouble();
        System.out.print("Enter the annual interest rate (in %): ");
        double rate = input.nextDouble();
        System.out.print("Enter the number of months: ");
        int months = input.nextInt();

        double monthlyInterestRate = rate / 100 / 12;
        double totalInterest = 0.0;

        System.out.println("\nMonth-by-month breakdown:");
        for (int i = 1; i <= months; i++) {
            double monthlyInterest = principal * monthlyInterestRate;
            principal += monthlyInterest;
            totalInterest += monthlyInterest;
            System.out.printf(
                    "Month %d: Monthly Interest = %.2f, Total Principal = %.2f%n",
                    i, monthlyInterest, principal
            );
        }

        System.out.printf("\nFinal total amount after %d months: %.2f%n", months, principal);
        System.out.printf("Total interest earned after %d months: %.2f%n", months, totalInterest);
    }
}
