/*Exercise 6:
Write a program that takes the lengths of three sides of a triangle and determines if it is:
• An equilateral triangle (all sides are equal)
• An isosceles triangle (two sides are equal)
• A scalene triangle (no sides are equal) */

package lab11;
import java.util.Scanner;
public class exercise6{
public static void main(String[] args) {
     Scanner input= new Scanner(System.in);
        int side1, side3, side2;
          System.out.print("Enter the Side 1");
          side1=input.nextInt();
           System.out.print("Enter the Side 2");
          side2=input.nextInt();
           System.out.print("Enter the Side 3");
          side3=input.nextInt();

          if ((side1 == side2) &&  (side2 == side3) && (side3 == side1)){
            System.out.print("An equilateral triangle (all sides are equal)");
        }
        else if ((side1 == side2) ||  (side1 == side3) || (side2 == side3)){
            System.out.print("An isosceles triangle (two sides are equal)");
        }
         else {
            System.out.print("A scalene triangle (no sides are equal)");
        }
    input.close();
    
}


}

