public class InsertionSort {
    public static void insertionSort(int[] array) {
        int index, x;
        for (int i = 1; i < array.length; i++) {
            x = array[i];
            index = i;
            while (index > 0 && x < array[index - 1]) {
                array[index] = array[index - 1];
                index--;
            }
            array[index] = x;
        }
    }
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {10, 9, 7, 5, 8, 30, 4, 28, 2};
        System.out.println("Array Before sorting: ");
        printArray(arr);
        insertionSort(arr);
        System.out.println("Array After sorting: ");
        printArray(arr);
    }
}

