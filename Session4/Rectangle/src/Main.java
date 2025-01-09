import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();
        System.out.print("Enter width: ");
        rectangle.width = sc.nextDouble();
        System.out.print("Enter height: ");
        rectangle.height = sc.nextDouble();
        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());
        System.out.println("Rectangle diagonal: " + rectangle.getDiagonal());
        System.out.println("Rectangle: " + rectangle.display());
    }
}
