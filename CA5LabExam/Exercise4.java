package CA5LabExam;

// Exercise5.java 
// just letter A, i didn`t finish letter B 

import java.util.Scanner; // Import Scanner class to read the inputs

public class Exercise4 {
    public static void main(String[] args) {
        String str1,str2,str3 ;

        // Declare and initialise the array with 3 integer values
        int[] x = {30, 40, 71};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first String ");
        str1 = input.next();
        System.out.print("Enter the second String ");
        str2 = input.next();
        System.out.print("Enter the second String ");
        str3 = input.next();

             


        // Print the original array
        printArray(x);

    }

    // Method to print the array contents in a formatted table with a total sum
    static void printArray(int[] x) {

               
        System.out.print ("int [] numbers = {");
         // Loop through the array
        for (int i = 0; i < x.length; i++) {
             
            System.out.print( " " + x[i]  );
           
        }
         System.out.print ("}");



    }
}