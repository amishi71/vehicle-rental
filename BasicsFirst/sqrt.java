//7. Find the square root of a number.
import java.util.Scanner;
public class sqrt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x: ");
        double x = scanner.nextDouble();
        
        System.out.println("sqrt of x="+ Math.sqrt(x));
         scanner.close(); 
    }
}