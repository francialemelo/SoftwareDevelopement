package CA5LabExam;

// Exercise4.java
// This program uses nested loops to print a triangle pattern of numbers.

public class Exercise4CA5 {
    public static void main(String[] args) {

        // Outer loop controls the rows - loops 3 times
        for (int row = 1; row <= 3; row++) {

            // First inner loop prints leading spaces
            // Row 1 gets 2 spaces, row 2 gets 1 space, row 3 gets 0 spaces
            for (int spaces = row; spaces < 3; spaces++) {
                System.out.print(" ");
            }

            // Second inner loop prints the numbers with a trailing space
            // Each row prints numbers that are multiples of 3, up to row * 3
            for (int col = 1; col <= row; col++) {
                System.out.print((col * 3) + " ");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}

