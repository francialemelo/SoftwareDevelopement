package Lab10;
import java.util.Scanner;
public class Vote {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          int age;
    System.out.print("Enter your age: ");
    age=input.nextInt();

    

       if(age >= 16 ){
            System.out.println("you can vote");
            
        }else{
            System.out.println("YOU cant NOT vote");
            
        }
 
    }

}
