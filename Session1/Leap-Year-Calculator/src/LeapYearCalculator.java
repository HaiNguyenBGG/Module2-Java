import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        int year;
        System.out.println("Nhập vào năm để kiểm tra: ");
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " là năm nhuận!");
                } else {
                    System.out.println(year + " không phải năm nhuận!");
                }
            } else {
                System.out.println(year + " là năm nhuận!");
            }
        }else {
            System.out.println(year + " không phải năm nhuận!");
        }
    }
}
