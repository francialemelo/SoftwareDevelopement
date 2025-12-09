package Ca2labexam;
import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String name ;
         double rate = 0,  euro= 0 , pounds = 0 ;
         System.out.print("Enter Name");
         name=input.next();

         System.out.print("Enter Euro Amount");
         euro=input.nextDouble();

         System.out.print("Enter Sterling conversion Rate");
         rate=input.nextDouble();

         pounds= euro*rate;

         System.out.print(name+", "+ euro +" will get you" + pounds + " pounds sterling");

    }
    
}
