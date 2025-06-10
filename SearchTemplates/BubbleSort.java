package SearchTemplates;
public class BubbleSort {
    // Bubble Sort in Ascending Order
    public static void bubbleSortAscending(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }
            // If no elements were swapped, array is already sorted
            if (!swapped) break;
        }
    }

    // Bubble Sort in Descending Order
    public static void bubbleSortDescending(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }
            // If no elements were swapped, array is already sorted
            if (!swapped) break;
        }
    }
    // Utility method to print array
    public static void printArray(int[] arr) {
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        int[] original = {64, 25, 12, 22, 11};

        // Ascending Sort
        int[] asc = original.clone();
        bubbleSortAscending(asc);
        System.out.print("Ascending Order: ");
        printArray(asc);

        // Descending Sort
        int[] desc = original.clone();
        bubbleSortDescending(desc);
        System.out.print("Descending Order: ");
        printArray(desc);
    }
}
