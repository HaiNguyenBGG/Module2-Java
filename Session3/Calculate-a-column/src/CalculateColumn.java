import java.util.Scanner;

public class CalculateColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int col = sc.nextInt();

        double[][] arr = new double[row][col];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Element [%d][%d]: ", i, j);
                arr[i][j] = sc.nextDouble();
            }
        }

        System.out.println("Array is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%.2f\t", arr[i][j]);
            }
            System.out.println();
        }

        System.out.print("Enter the column index to calculate sum (starting from 0): ");
        int colIndex = sc.nextInt();

        if (colIndex < 0 || colIndex >= col) {
            System.out.println("Invalid column index!");
        } else {
            double sum = 0;
            for (int i = 0; i < row; i++) {
                sum += arr[i][colIndex];
            }
            System.out.printf("Sum of column %d: %.2f", colIndex, sum);
        }
    }
}
