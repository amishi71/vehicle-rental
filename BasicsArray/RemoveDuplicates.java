package BasicsArray;
import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        Set<Integer> uniqueElements = new LinkedHashSet<>();
        for (int num : array) {
            uniqueElements.add(num);
        }

        System.out.println("Array after removing duplicates:");
        for (int num : uniqueElements) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
