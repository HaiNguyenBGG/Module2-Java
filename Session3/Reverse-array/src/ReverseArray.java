import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a size: ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20.");
            }
        } while (size > 20);
        arr = new int[size];
        int i = 0;
        while (i < size) {
            System.out.println("Enter element " + (i + 1) + " :");
            arr[i] = sc.nextInt();
            i++;
        }
        System.out.print("Original array: ");
        for (int num : arr) {
            System.out.printf(num + "\t");
        }
        System.out.println();
        for (int j = 0; j < arr.length / 2; j++) {
            int temp = arr[j];
            arr[j] = arr[size - 1 - j];
            arr[size - 1 - j] = temp;
        }
        System.out.print("Reversed array: ");
        for (int num : arr) {
            System.out.printf(num + "\t");
        }
    }
}
