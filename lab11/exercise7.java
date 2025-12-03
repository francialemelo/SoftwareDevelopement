
/*Exercise 7:
Write a Java program that simulates a simple ATM. The program should take an initial balance
and allow the user to perform the following operations:
• Check balance C
• Deposit money D
• Withdraw money W*/

package lab11;
import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double balance1, balance2;
        String opration; 
          System.out.print("Enter the inicial Balance ");
          balance1=input.nextDouble();
          System.out.print("Enter the operation • Check balance - C\r\n" + //
                            "• Deposit money - D\r\n" + //
                            "• Withdraw money - W");
          opration = input.next();

          if(opration.equals("C")){
             System.out.print("Balance is "+ balance1 );
 
          }else if (opration.equals("D")){
            System.out.print("Enter your deposite value ");
            balance2=input.nextDouble();

            System.out.print("your blanece is " + (balance1+balance2));


          } else if (opration.equals("W")) {
             System.out.print("Enter your Withdraw value ");
            balance2=input.nextDouble();
            if (balance2 > balance1) {
                System.out.print("Insuficient funds");

            } else {
            System.out.print("your blanece is " + (balance1-balance2)); }

          } else {
              System.out.print("Not a operation ");

          }
         

    input.close();





    }
    
}
