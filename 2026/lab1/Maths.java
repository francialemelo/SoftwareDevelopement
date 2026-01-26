/* Exercise 12:
Write a program, Maths.java, which prompts a user to enter two numbers and then prompts them
to select an arithmetic operation to perform on these two numbers. Output should be like the
examples shown below:*/

import java.util.Scanner;

public class Maths {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int first, second , choice; 
    System.out.println("Enter First Number:");
    first=input.nextInt();
    
    System.out.println("Enter second Number:");
    second=input.nextInt();

    System.out.println("what operation would you like to perform?");
    System.out.println("1-Add");
    System.out.println("2-Subtraction");
    System.out.println("3-Multiply");
    System.out.println("4-Divide");
    System.out.println("choice");
    choice=input.nextInt();


   switch(choice) {
  case 1:
    System.out.println(first+ " + " + second + "= " + (first+second)  );
    break;
  case 2:
     System.out.println(first+ " - " + second + "= " + (first-second)  );
    break;
     case 3:
    System.out.println(first+ " * " + second + "= " + (first*second)  );
     break;
  case 4:
    System.out.println(first+ " / " + second + "= " + (first/second)  );
    break;
  default:
   System.out.println("Enter a Valid Choice ");
        
    }
    input.close();
    }
}