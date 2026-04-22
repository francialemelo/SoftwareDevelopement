package CA5LabExam;

// Exercise3CA5.java
// This program prompts the user to enter a numerical result
// and prints the corresponding grade using cascading if-else statements.

import java.util.Scanner; // Import Scanner class to read user input

public class Exercise3CA5 {
    public static void main(String[] args) {

        // Create a Scanner object to read input from the keyboard
        Scanner input = new Scanner(System.in);

        // Declare an int variable to store the numerical result entered by the user
        int result;

        // Prompt the user to enter their numerical result
        System.out.print("Enter result: ");
        result = input.nextInt();

        // Use cascading if-else statements to determine and print the grade
        if (result < 0 || result > 100) {
            // Handle invalid values outside the range 0-100
            System.out.println("Invalid result. Please enter a value between 0 and 100.");
        } else if (result >= 90) {
            // Highest grade: 90 and above
            System.out.println("H1");
        } else if (result >= 80) {
            // Grade for results between 80 and 89
            System.out.println("H2");
        } else if (result >= 70) {
            // Grade for results between 70 and 79
            System.out.println("H3");
        } else if (result >= 60) {
            // Grade for results between 60 and 69
            System.out.println("H4");
        } else if (result >= 50) {
            // Grade for results between 50 and 59
            System.out.println("H5");
        } else if (result >= 40) {
            // Grade for results between 40 and 49
            System.out.println("H6");
        } else if (result >= 30) {
            // Grade for results between 30 and 39
            System.out.println("H7");
        } else {
            // Lowest grade: below 30
            System.out.println("H8");
        }

        // Close the Scanner to free up system resources
        input.close();
    }
}