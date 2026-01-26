

/*Exercise 10:
Write a program, Last.java, which prompts a user to enter a string and then prints out the last
character of that string to the screen. For example, if the user types in “Java”, then your program
should print ‘a’ to the screen. Use the String charAt and length methods in your solution.
*/

import java.util.Scanner;
public class Last {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String st1 ; 

    System.out.println("Enter First String:");
    st1=input.nextLine();
    
    

        if (st1.length() > 0) {

            char result = st1.charAt(st1.length() - 1 );
           
           System.out.println("Last Char is " + result);

        } else {
            System.out.println("Enter a Value");


        }        


       
    }
    
}
