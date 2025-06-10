package BasicsArray;
import java.util.Scanner;

public class SumElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements in array: ");
        int size = scanner.nextInt();
        int[] arrayOne = new int[size];

        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            arrayOne[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arrayOne[i];
        }

        System.out.println("The sum of the elements is: " + sum);
        scanner.close();
    }
}
