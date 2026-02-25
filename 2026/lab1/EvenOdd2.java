
/*Write a program, EvenOdd.java, which uses a do while loop to prompt a user to enter a number, and
the program should then output whether the number is odd or even. The user should then be
prompted continue by typing in Y. An example out from this program is as follows:*/
import java.util.Scanner;
public class EvenOdd2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number=0;
        char quit = 'N';
        do{
            System.out.println("Enter a Number ");
            number = input.nextInt();
            if(number%2==0){
                 System.out.println("even");

            }else{
              System.out.println("ODD");
   
            }
        System.out.println("Quit,Y for yes N fot no ):");
        quit= input.next().charAt(0);
        }while(quit=='N' || quit=='n');
         System.out.println("END");
         input.close();

    }
    
}
