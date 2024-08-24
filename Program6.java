//import stuff here!
import java.util.Scanner;

//Your code here
public class Program6 {
    public static void main(String[] args){
//make a scaner
    Scanner myScanner = new Scanner(System.in);
        //declare variables
        final double PI = 3.14159;
        
        
        //get input
        double radius = 0;

        System.out.println("Enter the radius = ");
        radius = myScanner.nextDouble();
        double diameter = 2 * radius;
        
      System.out.print("The radius of the circle is = " + radius);  
        
     System.out.println(); 
      
        System.out.println();
        
        System.out.print("The Diameter of the circle = " );
        System.out.format("%.3f", diameter);
        System.out.println();
 
 
System.out.println();
        
        double area = PI * (radius * radius);
         System.out.print("The area of the circle = ");
               System.out.format("%.3f", area);
               System.out.println();
       
               System.out.println();
               
        double circumference = PI * diameter;
                System.out.print("The Circumference of the circle = ");
               System.out.format("%.3f", circumference);
               System.out.println();

        
    }
}
//Paste console output below:
/*

Enter the radius = 
3.712
The radius of the circle is = 3.712

The Diameter of the circle = 7.424

The area of the circle = 43.288

The Circumference of the circle = 23.323
*/

