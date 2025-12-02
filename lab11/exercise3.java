package lab11;
//Write a program which prompts a user to enter two numbers. Check if both numbers entered
//are 4 and 2, or if one of the numbers is 4 or 2. Print an appropriate message to the screen. 
import java.util.Scanner;
public class exercise3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num1, num2;
     System.out.print("Enter a Number");
     num1=input.nextInt();
     System.out.print("Enter a second Number");
     num2=input.nextInt();

      if ((num1 == 4  || num1==2) || (num2 == 4  || num2==2) ) {
          System.out.println("numbers entered are  4 or 2" );
    } else {

        System.out.println("numbers entered are NOT  4 or 2" );
    }
    input.close();
}
}
