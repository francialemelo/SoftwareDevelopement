/* Write a program, Seconds.java, that prompts a user to enter a number for minutes as input and
prints a countdown in seconds from that number. For example if a user types in 1 minute then
output 60, 59, 58, etc… 3, 2, 1*/

import java.util.Scanner;
public class seconds {
    public static void main(String[] args) {
        int seconds = 0 ,minutes =0 ;
        Scanner input = new Scanner(System.in);
                 System.out.print("Enter a Int number for minutes");
                 minutes= input.nextInt();
                 seconds = minutes*60; 
     for (int i = seconds ; i >=0; i--){             
        
        System.err.println(i+ " ");

    }
    System.err.println();
    input.close();
    
}
}
