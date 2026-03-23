import java.util.Scanner;

public class SixthArray {
    public static void main(String[] args) {
        // Initialize an array with 10 integer values
        int[] numbers = {23, 104, 3, 65, 1002, 9000, 72, 88, 99, 10};
        
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number to search for: ");
        int target = input.nextInt();
        
        boolean found = false;
        int index = -1;

        // Iterate through the array to check for the target number
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                found = true;
                index = i;
                break; // Exit loop once the number is found
            }
        }

        // Print the result based on whether the number was found
        if (found) {
            System.out.println("The number " + target + " is contained in the array at index " + index + ".");
        } else {
            System.out.println("The number " + target + " is not contained in the array.");
        }
        
        input.close();
    }
}
