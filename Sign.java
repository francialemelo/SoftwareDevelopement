//ackage Lab10;
import java.util.Scanner;

public class Sign {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int num1=0 ;

    System.out.print("Enter a number: ");
    num1=input.nextInt();
    
        if(num1 == 0){
            System.out.println("ZERO");
            
        }else if (num1 > 0) {
            System.out.println("Positive");
        }
        else { 
            System.out.println("Negative");

        }    
          input.close();  
        }

     


}
    

