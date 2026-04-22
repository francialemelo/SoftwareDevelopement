package CA5LabExam;

// Exercise2.java


import java.util.Scanner; // Import Scanner class to read the inputs

public class Exercise2 {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Declare  double variable to store the amout spent
        double amount;

        // Prompt the user to enter the amount spent        
        System.out.print("Enterthe sale amount: ");
        amount = input.nextDouble();

       // Use cascading if-else statements to determine discount
        if (amount < 0 ) {
            // Handle invalid values outside the range 
            System.out.println("Invalid result. Please enter a value above 0");
        } else if (amount >= 200) {
           
            System.out.println("Platinum");
        } else if (amount >= 150) {
           
            System.out.println("Gold");
        } else if (amount >= 100) {
            
            System.out.println("Silver");
        } else if (amount >= 50) {
           
            System.out.println("Bronze");
        } else if (amount >= 1) {
            
            System.out.println("No discount");
        } 

        // Close the Scanner to free up system resources
        input.close();
    }
}