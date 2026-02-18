/*Exercise 6:
Write a program, Small.java, that finds the smallest of several integers. Assume that the first value
read specifies the number of values to input from the user. Your solution should use a for loop.
An example output is as follows: */

import java.util.Scanner;
public class Small {
    public static void main(String[] args) {
        int intergers =0, small=0, number=0 ;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of integers");
        intergers= input.nextInt();

        for (int i= 1; i<=intergers; i++){
            System.out.println("Enter number "+ i + ": ");
             number= input.nextInt();

             if (i==1){
                small = number;
             }else{
                if (number<small){
                     small = number;
                }
             }
        
        }

        System.err.println(("smallest number is "+ small));
        input.close();
        
    }
    
}
