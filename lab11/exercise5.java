/*Exercise 5:
Write a program that assigns grades based on a student's score:
• Fail: less than 40
• Pass: Greater than or equal to 40 and less than 50
• 2.2: Greater than or equal to 50 and less than 60
• 2.1: Greater than or equal to 60 and less than 70
• 1.1: Greater than or equal to 70 and less than or equal to 100 */

package lab11;
import java.util.Scanner;
public class exercise5 {
    public static void main(String[] args) {
         Scanner input= new Scanner(System.in);
        int grade;
          System.out.print("Enter the grade");
          grade=input.nextInt();

          if (grade >=70 && grade <= 100){
            System.out.print("1.1");
        }
        else if (grade >=60 && grade <= 70){
            System.out.print("2.1");
        }
       else if (grade >=50 && grade <= 60){
            System.out.print("2.2");
        }
        else if (grade >=40 && grade <= 50){
            System.out.print("PASS");
        }
        else {
            System.out.print("FAIL");
        }





    input.close();
    }
    
}
