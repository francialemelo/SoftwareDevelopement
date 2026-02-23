/*Write a program, Cubes.java, that prompts a user to enter a number and calculates the sum of the
cubes of each digit from 1 up to that number entered by the user using a for loop. An example
output from this program is as follows: */

import java.util.Scanner;
public class Cubes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
         int number = 0 , total=0;
         String  output = ""; 

         System.out.print("Enter a Number");
        number = input.nextInt();

        for(int i =1 ; i<=number; i++){
            total +=(i*i*i);

            if( i!= number){
                output+=(i+"^3 + ");
            }

        }
   
    // System.out.println(total);
    output += number + "^3= " +total ;
    System.out.println(output);
    input.close();
        5
    }
    
}
