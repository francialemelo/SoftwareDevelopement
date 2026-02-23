/*Write a program, Sum.java, which adds up all the digits of a number entered by a user and prints out
the result to the screen. For example, if the user inputs the number 1018, then the result printed to
the screen is 10 */

import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0, total = 0 , digit=0;
        String  output = "" , reverse ="";


        System.out.print("Enter a Number");
        number = input.nextInt();

        while (number>0){
           digit = number % 10;
           total += digit;
           number /= 10;
           output += digit + " + ";



        }
        //System.out.println("total:" + total );

        output=output.substring(0,output.length()-3);

        for (int i = output.length()-1; i>= 0; i--){

            reverse+= output.charAt(i);
        }
          System.out.println(reverse+" = " + total);
         input.close();
            }
       
}
