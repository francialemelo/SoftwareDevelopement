package CA5LabExam;

// Exercise2.java
// This program prompts the user to enter three numbers,
// then performs addition and multiplication on those numbers.

import java.util.Scanner; // Import Scanner class to read user input

public class Exercise2CA5 {
    public static void main(String[] args) {

        // Create a Scanner object to read input from the keyboard
        Scanner input = new Scanner(System.in);

        // Declare three int variables to store the numbers entered by the user
        int first, second, third;

        // Prompt the user to enter the first number and store it
        System.out.print("Enter first number: ");
        first = input.nextInt();

        // Prompt the user to enter the second number and store it
        System.out.print("Enter second number: ");
        second = input.nextInt();

        // Prompt the user to enter the third number and store it
        System.out.print("Enter third number: ");
        third = input.nextInt();

        // Print a blank line for formatting, matching the expected output
        System.out.println();

        // Calculate and print the result of adding all three numbers
        System.out.println(first + " + " + second + " + " + third + " = " + (first + second + third));

        // Calculate and print the result of multiplying all three numbers
        System.out.println(first + " * " + second + " * " + third + " = " + (first * second * third));

        // Close the Scanner to free up system resources
        input.close();
    }
}
