package BasicsArray;
import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements in array: ");
        int size = scanner.nextInt();
        int[] arrayOne = new int[size];

        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            arrayOne[i] = scanner.nextInt();
            if (arrayOne[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Total Even numbers: " + evenCount);
        System.out.println("Total Odd numbers: " + oddCount);

        scanner.close();
    }
}
