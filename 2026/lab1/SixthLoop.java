import java.util.Scanner;
public class SixthLoop {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);

          int i=0, counter  ;

        
           System.out.println("Enter a loop couter value:");
           counter= input.nextInt();
           System.out.println("before loop");
           
          while(i <= counter) {

         System.out.println("Loop Counter: Value is " + i);
         i++;
          }

          System.out.println("After loop");



    }
    
}
