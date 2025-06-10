package BasicsArray;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements in array: ");
        int size = scanner.nextInt();
        int[] arrayOne = new int[size];

        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            arrayOne[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (arrayOne[i] == target) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found.");
        }

        scanner.close();
    }
}
