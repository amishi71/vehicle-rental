//10. Prime Number Check
import java.util.Scanner;
public class primeno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false; 
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false; 
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(num + " Prime Number.");
        } else {
            System.out.println(num + " Not a Prime Number.");
        }
        scanner.close();
    }
}
