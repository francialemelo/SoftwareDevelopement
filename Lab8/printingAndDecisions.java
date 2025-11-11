package Lab8; 
import java.util.Scanner;

public class  printingAndDecisions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "Kevin";
        int first = 0, second = 1;
        double pi = 3.141592;

        System.out.printf("Hello %s> The value of Pi is %.2f.%nMy favourite colour is %s.%n", name,pi,"green") ;
        System.err.printf("A good number is %d%n", 100);

        System.out.print("Enter first int number: ");
        first=input.nextInt();


        System.out.print("Enter second int number: ");
        second=input.nextInt();

        if(first == second){
            System.out.println(first + "==" + second); //equal to 
        }
        
        if(first > second){
            System.out.println(first + ">" + second); //greater then 
        }
        
        if(first < second){
            System.out.println(first + "<" + second); // less then 
        }
        
        if(first >= second){
            System.out.println(first + ">=" + second); //greater then equal to 
        }
        
        if(first <= second){
            System.out.println(first + "<=" + second); //less then equal to 
        }
          if(first != second){
            System.out.println(first + "!=" + second); //not equal
        }



    }

    
}