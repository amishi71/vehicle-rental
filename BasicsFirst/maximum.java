//2. Find the maximum of two numbers.
import java.util.Scanner;
public class maximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x: ");
        double x = scanner.nextDouble();
        System.out.print("Enter y: ");
        double y = scanner.nextDouble();
    
         System.out.println("Maximum: "+ Math.max(x,y));
          scanner.close(); 
    }
}