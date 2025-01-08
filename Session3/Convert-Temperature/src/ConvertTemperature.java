import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int choice;
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            try {
                choice = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid selection! Please enter a number from 1 to 3.");
                sc.nextLine();
                continue;
            }
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter fahrenheit: ");
                    double fahrenheit = sc.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit));
                }
                case 2 -> {
                    System.out.print("Enter celsius: ");
                    double celsius = sc.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(celsius));
                }
                case 3 -> System.exit(0);
                default -> System.out.println("Invalid choice");
            }
            System.out.println("Enter to continue...");
            sc.nextLine();
            sc.nextLine();
        }
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }
}
