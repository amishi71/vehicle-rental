package SearchTemplates;
public class InsertionSort {
    // Insertion Sort in Ascending Order
    public static void insertionSortAscending(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements greater than key one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    // Insertion Sort in Descending Order
    public static void insertionSortDescending(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements smaller than key one position ahead
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    // Utility method to print array
    public static void printArray(int[] arr) {
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] original = {5, 3, 8, 6, 2, 7};

        // Ascending Sort
        int[] asc = original.clone();
        insertionSortAscending(asc);
        System.out.print("Ascending Order: ");
        printArray(asc);

        // Descending Sort
        int[] desc = original.clone();
        insertionSortDescending(desc);
        System.out.print("Descending Order: ");
        printArray(desc);
    }
}
