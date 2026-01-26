/*Exercise 11:
Write a program, Month.java, which prompts a user to enter a number, from 1 to 12 inclusive. Based
on the input value provided, output a string to the screen which displays the month that number
represents. For 1, output January, for 2, output February, etc … If the number entered is not from 1
to 12, output Month Unknown. Output should be like the examples shown below:
*/
import java.util.Scanner;
public class Month {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = 0; 
       
       
        System.out.println("Enter a month Number:");
        month=input.nextInt();


    switch(month) {
  case 1:
    System.out.println("Jan");
    break;
  case 2:
     System.out.println("Feb");
    break;
     case 3:
     System.out.println("Mar");
  case 4:
     System.out.println("Apr");
    break;
     case 5:
     System.out.println("May");
    break;
  case 6:
     System.out.println("Jun");
    break;
     case 7:
     System.out.println("Jul");
    break;
  case 8:
     System.out.println("Aug");
    break;
     case 9:
     System.out.println("Set");
    break;
  case 10:
     System.out.println("Oct");
    break;
     case 11:
    System.out.println("Nov");
    break;
     case 12:
     System.out.println("Dec");
    break;
  default:
   System.out.println("Enter a Valid Month ");
        
    }
    
    }
}
