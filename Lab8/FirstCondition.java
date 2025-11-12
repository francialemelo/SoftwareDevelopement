package Lab8;
import java.util.Scanner;
public class FirstCondition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x ;


        System.out.print("Enter first int number: ");
        x=input.nextInt();

        if(x == 7){
            System.out.println("The number entered is equal to: " + x); 
            

        }

        if(x != 7){
            System.out.println("The number entered is not 7 it is equal to: " + x); 
            

        }
     
        input.close();
    }
    
}
