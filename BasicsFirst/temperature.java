//6. Convert Celsius to Fahrenheit.
import java.util.Scanner;
public class temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temp in celsius: ");
        double C = scanner.nextDouble();
        double F = (((9.0/5) * C) + 32);
    
         System.out.println("temp in fahrenheit is: "+ F);
          scanner.close(); 
    }
}