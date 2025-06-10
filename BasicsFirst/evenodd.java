//3. Check whether a number is even or odd.
import java.util.Scanner;
public class evenodd {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("x= ");
        double x= scanner.nextDouble();
       
        if (x%2==0) {
        System.out.println("even");
        } else {
        System.out.println("odd");
        }
        scanner.close();
    }
}

