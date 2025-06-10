//4. Calculate the area and perimeter of a rectangle.
import java.util.Scanner;
public class areaperimeter {
   public static void main(String[] args){
    Scanner scanner= new Scanner(System.in);

    System.out.print("x=");
    double x= scanner.nextDouble();
    System.out.print("y=");
    double y= scanner.nextDouble();

    double area = x * y;
    double perimeter = 2 * (x + y);

    System.out.println("Area: " + area);
    System.out.println("Perimeter: " + perimeter);
    
    scanner.close();
   }
}
