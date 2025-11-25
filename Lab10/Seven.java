package Lab10;
import java.util.Scanner;
public class Seven {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int num1 ;

         System.out.print("Enter number: ");
        num1=input.nextInt();

          if(num1== 7){
            System.out.println("You entered number "+num1+ " is equal to 7");
            
        }else{
            System.out.println("You entered number "+num1+ " is NOT equal to 7");
             System.out.println("Enter another number");
             //num1=input.nextInt();


        }
}
}
