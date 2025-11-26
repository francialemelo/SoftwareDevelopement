import java.util.Scanner;
public class NumberRange {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
         int num1=0 ;
    System.out.print("Enter a number: ");
    num1=input.nextInt();     

    if(num1 >=10 && num1<=20){
            System.out.println("this range");
            
    }
        else { 
            System.out.println("this NOT range");

        }    
          input.close();  
        }
    
}    

