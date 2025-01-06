import java.util.Scanner;

public class changeMoney {
    public static void main(String[] args) {
        float money;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền cần đổi: ");
        money = sc.nextFloat();
        System.out.println("Số tiền bạn đổi là: " + money + " USD");

        float a = money*23000;
        System.out.println("Số tiền bạn đổi là: " + a + " VND");
    }
}
