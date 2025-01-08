import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size array 1: ");
        int size1 = sc.nextInt();
        int[] array1 = new int[size1];

        System.out.print("Size array 2: ");
        int size2 = sc.nextInt();
        int[] array2 = new int[size2];

        System.out.println("Enter elements of array 1:");
        for (int i = 0; i < size1; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array1[i] = sc.nextInt();
        }

        System.out.println("Enter elements of array 2:");
        for (int i = 0; i < size2; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array2[i] = sc.nextInt();
        }

        int[] array3 = new int[size1 + size2];

        for (int i = 0; i < size1; i++) {
            array3[i] = array1[i];
        }

        for (int i = 0; i < size2; i++) {
            array3[size1 + i] = array2[i];
        }

        System.out.println("Array 1:");
        for (int num : array1) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Array 2:");
        for (int num : array2) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Merge arrays (array 3):");
        for (int num : array3) {
            System.out.print(num + " ");
        }
    }
}
