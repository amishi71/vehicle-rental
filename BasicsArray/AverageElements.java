package BasicsArray;
import java.util.Scanner;

public class AverageElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements in array: ");
        int size = scanner.nextInt();  
        float[] arrayOne = new float[size];

        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            arrayOne[i] = scanner.nextFloat();  
        }

        float sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arrayOne[i];
        }

        float avg = sum / size;
        System.out.println("The average of the elements is: " + avg);

        scanner.close();
    }
}
