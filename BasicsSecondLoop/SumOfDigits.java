package BasicsSecondLoop;
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10; // extract last digit
            sum += digit;          // add digit to sum
            temp /= 10;            // remove last digit
        }

        System.out.println("Sum of digits = " + sum);

        scanner.close();
    }
}
