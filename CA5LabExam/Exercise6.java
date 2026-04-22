package CA5LabExam;

import java.util.Scanner; // Import Scanner class to read the inputs
public class Exercise6 {
    public static void main(String[] args) { 
       
       Scanner input = new Scanner(System.in);
       // Declare  String variable to store 
        int number;

        // Prompt the user to enter the amount spent        
        System.out.print("Enter the Number ");
        number = input.nextInt();
        PrintLength(number);
       
    

    }
     static void PrintLength(int number) {
        if (number < 100) { // testing if is less than 100
        System.out.println("The " + number + " is less than 100");
        }else {
         System.out.println("The " + number + " is NOT less than 100");}

     }

    }
    