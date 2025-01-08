import java.util.Scanner;

public class AddElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Enter the index where you want to add the element: ");
        int index = sc.nextInt();
        System.out.print("Enter the value of the element: ");
        int value = sc.nextInt();

        int[] updatedArray = addElement(arr, index, value);

        if (updatedArray != null) {
            System.out.println("Updated array: ");
            for (int num : updatedArray) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println("Invalid index. Element not added.");
        }
    }

    public static int[] addElement(int[] arr, int index, int value) {

        int newSize = Math.max(arr.length + 1, index + 1);
        int[] newArr = new int[newSize];

        for (int i = 0; i < index && i < arr.length; i++) {
            newArr[i] = arr[i];

        }

        newArr[index] = value;

        for (int i = index; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        return newArr;
    }
}
