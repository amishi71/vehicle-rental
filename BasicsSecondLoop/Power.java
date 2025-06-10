package BasicsSecondLoop;
import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter exponent (b): ");
        int b = scanner.nextInt();

        int result = 1;

        for (int i = 1; i <= b; i++) {
            result *= a;
        }

        System.out.println(a + "^" + b + " = " + result);

        scanner.close();
    }
}
