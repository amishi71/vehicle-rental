//9. Reverse a Number - 12345
import java.util.Scanner;
public class reversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int reversed = 0;

        while (n != 0) {
            int digit = n % 10;            
            reversed = reversed * 10 + digit; 
            n /= 10;                         
        }

        System.out.println("Reversed number: " + reversed);

        scanner.close();
    }
}
