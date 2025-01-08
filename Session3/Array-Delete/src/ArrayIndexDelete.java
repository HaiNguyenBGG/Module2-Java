import java.util.Scanner;

public class ArrayIndexDelete {
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
        for ( int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.print("Enter the element want to delete: ");
        int elementDelete = sc.nextInt();

        int[] updatedArray = elementDelete(arr, elementDelete);

        System.out.print("Updated array: ");
        if (updatedArray.length > 0) {
            for (int num : updatedArray) {
                System.out.print(num + "\t");
            }
        } else {
            System.out.print("Array is empty.");
        }
    }

    public static int[] elementDelete(int[] arr, int elementDelete) {

        int indexDelete = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elementDelete) {
                indexDelete = i;
                break;
            }
        }

        if (indexDelete == -1) {
            System.out.println("Element not found in the array.");
            return arr;
        }

        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != indexDelete) {
                newArr[j++] = arr[i];
            }
        }

        System.out.println("Delete element successfully.");
        return newArr;
    }
}

