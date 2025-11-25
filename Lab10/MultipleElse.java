package Lab10;
import java.util.Scanner;

public class MultipleElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int num1, num2;
      
      
    System.out.print("Enter number: ");
    num1=input.nextInt();

     System.out.print("Enter another number: ");
    num2=input.nextInt();

       if(num1%num2==0){
            System.out.println("multiplo");
            
        }else{
            System.out.println("NOT multiplo");
            
        }

    }
    
}
