package SearchTemplates;
public class SelectionSort {
    // Selection Sort in Ascending Order
    public static void selectionSortAscending(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the minimum element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Selection Sort in Descending Order
    public static void selectionSortDescending(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;

            // Find the maximum element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            // Swap the found maximum element with the first element
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Utility method to print an array
    public static void printArray(int[] arr) {
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] original = {29, 10, 14, 37, 14};

        // Ascending Sort
        int[] asc = original.clone();
        selectionSortAscending(asc);
        System.out.print("Ascending Order: ");
        printArray(asc);

        // Descending Sort
        int[] desc = original.clone();
        selectionSortDescending(desc);
        System.out.print("Descending Order: ");
        printArray(desc);
    }
}
