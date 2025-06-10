package BasicsArray;
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements in array: ");
        int size = scanner.nextInt();

        if (size < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }

        int[] arrayOne = new int[size];
        System.out.println("Enter the elements:");

        for (int i = 0; i < size; i++) {
            arrayOne[i] = scanner.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            if (arrayOne[i] > largest) {
                secondLargest = largest;
                largest = arrayOne[i];
            } else if (arrayOne[i] > secondLargest && arrayOne[i] != largest) {
                secondLargest = arrayOne[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest.");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }

        scanner.close();
    }
}
