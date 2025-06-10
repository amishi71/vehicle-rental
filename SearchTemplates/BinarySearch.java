package SearchTemplates;
import java.util.Arrays;
public class BinarySearch {

    // 1. Inbuilt binary search using Arrays.binarySearch
    public static int inbuiltBinarySearch(int[] arr, int target) {
        return Arrays.binarySearch(arr, target);
    }

    // 2. Recursive binary search
    public static int recursiveBinarySearch(int[] arr, int target, int low, int high) {
        if (low > high) return -1; // base case: not found

        int mid = low + (high - low) / 2;

        if (arr[mid] == target) return mid;
        else if (arr[mid] > target)
            return recursiveBinarySearch(arr, target, low, mid - 1);
        else
            return recursiveBinarySearch(arr, target, mid + 1, high);
    }

    // 3. Iterative binary search
    public static int iterativeBinarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }

        return -1; // not found
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 10, 15, 18, 21, 27, 33, 39};
        int target = 15;

        // Inbuilt
        int indexInbuilt = inbuiltBinarySearch(arr, target);
        System.out.println("Inbuilt Binary Search: Found at index " + indexInbuilt);

        // Recursive
        int indexRecursive = recursiveBinarySearch(arr, target, 0, arr.length - 1);
        System.out.println("Recursive Binary Search: Found at index " + indexRecursive);

        // Iterative
        int indexIterative = iterativeBinarySearch(arr, target);
        System.out.println("Iterative Binary Search: Found at index " + indexIterative);
    }
}
