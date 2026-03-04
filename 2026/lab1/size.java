
/*Write a program, Size.java, which prompts a user to enter a number. The number entered
determines the size the user should go for. The following rules apply to determine size:
- Number entered is greater than 70 and less than or equal to 100, then “Go for large size”.
- Number entered is greater than 35 and less than or equal to 70, then “Go for Medium size”.
- Number entered is greater than or equal to 10 and less than or equal to 35, then “Go for
small size”.
- Otherwise the “size is not available” */

import java.util.Scanner;

public class size {
    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to determine your size: ");
        
        int number = scanner.nextInt();
        
        if (number > 70 && number <= 100) {
            System.out.println("Go for large size");
        } else if (number > 35 && number <= 70) {
            System.out.println("Go for Medium size");
        } else if (number >= 10 && number <= 35) {
            System.out.println("Go for small size");
        } else {
            System.out.println("size is not available");
        }

        // Close the scanner
        scanner.close();
        }
}

