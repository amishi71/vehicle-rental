package SearchTemplates;
public class LinearSearch {

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index if the target is found
            }
        }
        return -1; // Return -1 if the target is not found
    }

    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};
        int target = 15;
        int result = linearSearch(numbers, target);

        if (result == -1) {
            System.out.println("Element is not found!");
        } else {
            System.out.println("Element is found at index: " + result);
        }
    }
}

