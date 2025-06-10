package ArithmeticCalculator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = 0, y = 0;
        int choice = 0;

        try {
            System.out.print("Enter x: ");
            x = scanner.nextDouble();

            System.out.print("Enter y: ");
            y = scanner.nextDouble();

        } catch (InputMismatchException ime) {
            System.out.println("Invalid input.");

            scanner.close();

            return;
        }

        while (choice != 7) {
            System.out.println("\nMain Menu:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. divide");
            System.out.println("4. Multiply");
            System.out.println("5. sqrt x");
            System.out.println("6. Modulus");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Add: " + (x + y));
                        break;

                    case 2:
                        System.out.println("Subtract: " + (x - y));
                        break;

                    case 3:
                        if (y == 0) {
                            System.out.println("Error: Division by zero.");
                        } else {
                            System.out.println("Divide: " + (x / y));
                        }
                        break;

                    case 4:
                        System.out.println("Multiply: " + (x * y));
                        break;

                    case 5:
                        if (x < 0) {
                            System.out.println("Error: square root of a negative number.");
                        } else {
                            System.out.println("Sqrt : " + Math.sqrt(x));
                        }
                        break;

                    case 6:
                        System.out.println("Modulus: " + (x % y));
                        break;

                    case 7:
                        System.out.println("Exit...");
                        break;

                    default:
                        System.out.println("choose a correct option.");
                }
            } catch (InputMismatchException ime) {
                System.out.println("Enter a valid integer.");

                scanner.next();
            } catch (Exception e) {
                System.out.println("Unexpected error: " + e.getMessage());
            }
        }

        scanner.close();
        
    }
}
