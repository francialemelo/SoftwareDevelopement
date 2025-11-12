package Lab8;
import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

    System.out.print("Input number: ");
    number=input.nextInt();

    if (number > 7) {
    System.out.println(number + " is greater than 7.");
    } 
      if (number == 7) {
    System.out.println("Sunday");
    } 
      if (number == 6) {
    System.out.println("Saturday");
    } 
      if (number == 5) {
    System.out.println("Friday");
    } 
      if (number == 4) {
    System.out.println("Thursday");
    } 
        if (number == 3) {
    System.out.println("Wednesday");
    } 
        if (number == 2) {
    System.out.println("Tuesday");
    }
    if (number == 1) {
    System.out.println("Monday");
    } 
     
   input.close();
    }
    
}
