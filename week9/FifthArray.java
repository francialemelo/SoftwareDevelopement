import java.util.Scanner;

public class FifthArray {
    public static void main(String[] args) {
        int[] numbers = new int[8]; // Create an array to hold 8 integer values
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Please enter 8 integer values:");

        // Loop to prompt the user and store values in the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt(); // Read integer input from the user
        }

        // Print the contents of the array in a table and calculate the sum
        System.out.println("\n-----------------");
        System.out.println("| Index | Value |");
        System.out.println("-----------------");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("| %-5d | %-5d |\n", i, numbers[i]);
            sum += numbers[i]; // Add each element to the sum
        }
        System.out.println("-----------------");

        // Calculate and display the average value
        // Use a double for the average to ensure decimal precision
        double average = (double) sum / numbers.length;
        System.out.printf("The average value is: %.2f\n", average);

        // Close the scanner
        scanner.close(); 
    }
}
