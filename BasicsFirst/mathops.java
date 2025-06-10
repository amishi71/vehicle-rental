
//21/5/25
//1. Take two numbers as input and print their addition, subtraction, multiplication, division and modulus.
import java.util.Scanner;
public class mathops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x: ");
        double x = scanner.nextDouble();
        System.out.print("Enter y: ");
        double y = scanner.nextDouble();

        double addition = x + y;
        double subtraction = x - y;
        double multiplication = x * y;

        if (y != 0) {
            double division = x / y;
            double modulus = x % y;
            
            System.out.println("Add: " + addition);
            System.out.println("Subtract: " + subtraction);
            System.out.println("Multiply: " + multiplication);
            System.out.println("Divide: " + division);
            System.out.println("Modulus: " + modulus);
        } else {
            System.out.println("Cannot divide or take modulus by zero.");
        }

        scanner.close();
    }
}




