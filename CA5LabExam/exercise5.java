package CA5LabExam;

import java.util.Scanner; // Import Scanner class to read the inputs
public class exercise5 {
    public static void main(String[] args) { 
       
       Scanner input = new Scanner(System.in);
       // Declare  String variable to store 
        String word;

        // Prompt the user to enter the amount spent        
        System.out.print("Enter the word: ");
        word = input.next();
        PrintLength(word);
       
    

    }
     static void PrintLength(String word) {
        System.out.println("The " + word + " has " + word.length() + " Characteres");


     }

    }
    
