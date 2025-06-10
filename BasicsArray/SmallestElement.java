package BasicsArray;
import java.util.Scanner;

public class SmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements in array: ");
        int size = scanner.nextInt();
        int[] arrayOne = new int[size];

        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            arrayOne[i] = scanner.nextInt();
        }

        int smallest = arrayOne[0];  // Start from the first element
        for (int i = 1; i < size; i++) {
            if (arrayOne[i] < smallest) {
                smallest = arrayOne[i];
            }
        }

        System.out.println("The smallest element is: " + smallest);
        scanner.close();
    }
}
