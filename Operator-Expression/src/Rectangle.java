import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập vào chiều rộng: ");
        width = scanner.nextFloat();

        System.out.printf("Nhập vào chiều cao: ");
        height = scanner.nextFloat();

        float area = width * height;
        System.out.println("Diện tích hình chữ nhật là: " + area);
    }
}
