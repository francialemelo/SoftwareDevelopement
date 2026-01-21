
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number ;

        System.out.print("Enter a int Number:");
        number=input.nextInt();
        System.out.print("The number is : " + number + "  ");

         if((number %= 2 ) == 0 ){
            System.out.println("The number entered is even."); 
            

        }else {
            System.out.println("The number entered is odd."); 
        }

        input.close();
        }         
        
    }
    

