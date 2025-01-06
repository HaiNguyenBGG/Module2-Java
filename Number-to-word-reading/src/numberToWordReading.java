import java.util.Scanner;

public class numberToWordReading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] arr2 = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] arr3 = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety", "hundred"};
        String ans = "";
        if (num == 0) {
            ans = arr[0];
        } else if (num < 10) {
            ans = arr[num];
        } else if (num < 20) {
            ans = arr2[num - 10];
        } else if (num < 100) {
            if (num % 10 == 0) {
                ans = arr3[num / 10 - 2];
            } else {
                ans = arr3[num / 10 - 2] + " " + arr[num % 10];
            }
        } else if (num < 1000) {
            int rem = num % 100;
            if (rem == 0) {
                ans = arr[num / 100] + " hundred";
            } else if (rem < 10) {
                ans = arr[num / 100] + " hundred " + arr[rem];
            } else if (rem < 20) {
                ans = arr[num / 100] + " hundred" + arr2[rem - 10];
            } else {
                ans = arr[num / 100] + " hundred " + arr3[rem / 10 - 2] + " " + arr[rem % 10];
            }
        }
        System.out.println(ans);
    }
}
