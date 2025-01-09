import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double delta = equation.getDiscriminant();

        if (delta > 0) {
            System.out.println("The equation has two roots: ");
            System.out.print("Root 1: " + equation.getRoot1());
            System.out.println();
            System.out.print("Root 2: " + equation.getRoot2());
        } else if (delta == 0) {
            System.out.println("The equation has one root: ");
            System.out.print("Root: " + equation.getRoot1());
        } else {
            System.out.print("The equation has no root.");
        }
    }
}