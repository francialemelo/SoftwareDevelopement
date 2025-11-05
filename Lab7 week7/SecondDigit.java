import java.util.Scanner;
public class SecondDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num1, digit;

        System.out.print("Enter a four digit int number: ");
        num1=input.nextInt();


        digit = ((num1%1000) / 100);;
        System.out.print("Second Digit is " + digit);
        

        input.close();

    }
    
}
