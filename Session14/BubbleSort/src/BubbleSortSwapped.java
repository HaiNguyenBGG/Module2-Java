import java.util.Arrays;

public class BubbleSortSwapped {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 2, 4, 8};
        System.out.println("Array Before sorting: " + Arrays.toString(numbers));

        bubbleSort(numbers);

        System.out.println("Array After sorting: " + Arrays.toString(numbers));
    }
}
