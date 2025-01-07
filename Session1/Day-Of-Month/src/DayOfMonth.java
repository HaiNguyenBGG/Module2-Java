import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tháng cần kiểm tra: ");
        i = scanner.nextInt();
        switch (i) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("Tháng " + i + " có 31 ngày.");
            case 4, 6, 9, 11 -> System.out.println("Tháng " + i + " có 30 ngày");
            case 2 -> System.out.println("Tháng 2 có 28 hoặc 29 ngày");
        }
    }
}
