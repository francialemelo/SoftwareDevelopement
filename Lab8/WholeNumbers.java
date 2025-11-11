package Lab8;
import java.util.Scanner;

public class WholeNumbers {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         int num1 , num2;

        System.out.printf("Enter a int number: ");
        num1=input.nextInt();
        System.out.printf("Enter another int number: ");
        num2=input.nextInt();

        System.out.printf("Numbers entered were %d and %d%n", num1, num2);


    }
}
