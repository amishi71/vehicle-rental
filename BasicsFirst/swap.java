//5. Swap two numbers (with and without a third variable).
import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x: ");
        double x = scanner.nextDouble();
        System.out.print("Enter y: ");
        double y = scanner.nextDouble();
        //third variable
        /*double temp = x ;
        x=y;
        y= temp;

         System.out.println("swapped: x="+ x);
         System.out.println("swapped: y="+ y);


                            */
         //w/o third

         x=x+y;
         y=x-y;
         x=x-y;
         System.out.println("swapped: x="+ x);
         System.out.println("swapped: y="+ y);

         scanner.close(); 
    }
}