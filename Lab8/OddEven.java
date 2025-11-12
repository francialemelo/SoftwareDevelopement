package Lab8;
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num ;

    System.out.print("Enter first int number: ");
    num=input.nextInt();
    
    if((num % 2 == 0) ){
            System.out.println("The number entered is even. the number is : " + num ); 
            

        }

     if((num % 2 != 0) ){
            System.out.println("The number entered is odd. the number is : " + num ); 
            

        }

input.close();
        
    }
    
}
