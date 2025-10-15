import java.util.Scanner;

public class lab5_exercise1 {
    /*Create a new class InputNumber. This class should prompt the user to enter a number and print that
number to the screen. An example of the output is as follows:*/

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
     int number;

     System.out.print("Enter a Number: ");
     number= input.nextInt();
     System.out.print("The Number Entered was: ");
     System.out.println(number);

     input.close();


}
}