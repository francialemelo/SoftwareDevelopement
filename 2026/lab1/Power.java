/*Write a program, Power.java, that prompts a user to enter a number and calculates the sum of each
digit of that number raised to itself. An example output from this program is as follows: */


import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int total = 0 , digit = 0, number =0;

          System.out.print("Enter a Number ");
        number = input.nextInt();

        for(; number>0; number/=10){
            digit=number%10;
             System.out.println(digit + "^" + digit + " = " + Math.pow(digit,digit) );
            total+=Math.pow(digit,digit);


        }
        System.out.println("sum of digits raised to themselves: " + total );
        input.close();
        
    }

}
