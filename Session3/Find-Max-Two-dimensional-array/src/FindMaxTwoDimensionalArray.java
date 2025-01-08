import java.util.Scanner;

public class FindMaxTwoDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Enter element at (%d, %d): ", i, j);
                arr[i][j] = sc.nextInt();
            }
        }
        int max = arr[0][0];
        int maxRow = 0;
        int maxCol = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        System.out.println();
        System.out.println("The maximum element of the array is: " + max);
        System.out.printf("It is located at (%d, %d)", maxRow, maxCol);
    }
}
