package CA5LabExam;

// Exercise5.java
// This program declares an array, prints its contents and sum,
// then updates even values by adding 100 and prints the updated array.

public class Exercise5CA5 {
    public static void main(String[] args) {

        // Declare and initialise the array with 6 integer values
        int[] x = {1, 2, 3, 4, 5, 6};

        // Print the original array
        printArray(x);

        // Loop through the array and add 100 to every even value
        for (int i = 0; i < x.length; i++) {
            if (x[i] % 2 == 0) {
                x[i] += 100;
            }
        }

        // Print the updated array after modifying even values
        printArray(x);
    }

    // Method to print the array contents in a formatted table with a total sum
    static void printArray(int[] x) {

        // Print the table header
        System.out.println("Index\tValue");
        System.out.println("-----\t-----");

        // Variable to accumulate the total sum of all values in the array
        int total = 0;

        // Loop through the array and print each index and its value
        for (int i = 0; i < x.length; i++) {
            System.out.println(i + "\t" + x[i]);
            total += x[i]; // Add each value to the running total
        }

        // Print the separator and total sum
        System.out.println("--------------");
        System.out.println("Total: " + total);
        System.out.println(); // Blank line to separate the two tables
    }
}