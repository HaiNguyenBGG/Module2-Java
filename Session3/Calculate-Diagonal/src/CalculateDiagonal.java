import java.util.Scanner;

public class CalculateDiagonal {
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

        if (row != col) {
            System.out.println("The array is not square, so diagonals cannot be calculated.");
        } else {
            double mainDiagonalSum = 0;
            for (int i = 0; i < row; i++) {
                mainDiagonalSum += arr[i][i];
            }
            System.out.printf("Sum of the main diagonal: %.2f\n", mainDiagonalSum);

        }
    }
}
