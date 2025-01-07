import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of prime numbers to display: ");
        int n = input.nextInt();
        while (n <= 0) {
            System.out.print("Enter a positive number greater than 0: ");
            n = input.nextInt();
        }

        int count = 0;
        int num = 2;

        System.out.printf("The first " + n + " prime numbers are: ");
        while (count < n) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        System.out.print("\nPrime numbers less than 100: ");
        displayPrimesLessThan100();
    }
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void displayPrimesLessThan100() {
        for (int num = 2; num < 100; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}
