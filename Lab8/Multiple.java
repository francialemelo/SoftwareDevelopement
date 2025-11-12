package Lab8;
import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        
    
    Scanner input = new Scanner(System.in);
        int num , num2 ;

    System.out.print("Enter first int number: ");
    num=input.nextInt();

    System.out.print("Enter second int number: ");
    num2=input.nextInt();

     if((num % num2 == 0) ){
            System.out.println(num+ " is multiple of : " + num2 ); 
            

        }

        input.close();
    
}
}