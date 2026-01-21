
import java.util.Scanner;
public class Compound {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int number;
        
        System.out.print("Enter a int Number:");
        number=input.nextInt();
        
        System.out.println("Number is" + number);
        number +=2;
        

         System.out.println("number + 2 is "+ number);
         number -=5;

         System.out.println("number -5 is "+ number);
         
        
       input.close();  


    }
    
}

