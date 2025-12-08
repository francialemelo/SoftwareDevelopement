package Ca2Sample;
import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
       double denary1, denary2, denary3,product;

        System.out.print("Enter first number");
         denary1=input.nextDouble();

        System.out.print("Enter second number");
        denary2=input.nextDouble();

        System.out.print("Enter third number");
        denary3=input.nextDouble();

       product=(denary1*denary2*denary3);

        System.out.print (denary1 +" * " + denary2 +" * "+denary3 +" = " + product);
        input.close();
    }
    
}
