package Ca2Sample;
import java.util.Scanner;

public class Javasheet {

    public static void main(String[] args) {

        // ==========================================================
        // 1. ESCAPE SEQUENCES
        // ==========================================================

        System.out.println("Line 1\nLine 2");     // \n new line
        System.out.println("Column1\tColumn2");   // \t tab

        // Useful for formatting:
        // System.out.println("Hello\nWorld");
        // System.out.println("Name:\tFran");

        // ==========================================================
        // 2. CHAR EXAMPLES
        // ==========================================================

        char letter = 'A';
        char numberChar = '5';
        char symbol = '$';

        // Convert char digit to int:
        // int value = Character.getNumericValue(numberChar);

        // ==========================================================
        // 3. STRING METHODS
        // ==========================================================

        String text = "Hello World";

        int len = text.length();            // returns length
        char first = text.charAt(0);        // char at index
        char last = text.charAt(text.length() - 1);

        String sub1 = text.substring(0, 5); // "Hello"
        String sub2 = text.substring(6);    // "World"

        String upper = text.toUpperCase();
        String lower = text.toLowerCase();

        boolean contains = text.contains("Hell");

        // ==========================================================
        // 4. STRING COMPARISON
        // ==========================================================

        String a = "yes";
        String b = "YES";

        boolean same = a.equals(b);               // case-sensitive
        boolean sameIgnore = a.equalsIgnoreCase(b);

        // ==========================================================
        // 5. SCANNER METHODS
        // ==========================================================

        Scanner sc = new Scanner(System.in);

        // READ String:
        // String name = sc.nextLine();

        // READ int:
        // int age = sc.nextInt();

        // CHECK if input is int:
        // if (sc.hasNextInt()) {
        //     int value = sc.nextInt();
        // } else {
        //     System.out.println("Not an int");
        // }

        // READ double:
        // double price = sc.nextDouble();

        // Clear buffer:
        // sc.nextLine();

        // ==========================================================
        // 6. IF/ELSE STRUCTURE
        // ==========================================================

        int number = 10;

        if (number > 10) {
            System.out.println("Greater than 10");
        } else if (number == 10) {
            System.out.println("Equal to 10");
        } else {
            System.out.println("Less than 10");
        }

       
        // ==========================================================
        // 7. MATH & CASTING
        // ==========================================================

        int x = 5;
        int y = 2;

        int division = x / y;             // 2
        double division2 = (double)x / y; // 2.5  (casting)

        int mod = x % y;                  // remainder

        // ==========================================================
        // 10. OPERATORS
        // ==========================================================

        // Arithmetic: + - * / %
        // Comparison: == != > >= < <=
        // Logical: && || !
        // Assignment: = += -= *= /= %=

        // ==========================================================
        // 11. CONCATENATION
        // ==========================================================

        String fullName = "Fran" + " " + "Silva";
        String message = "Age: " + 30;

        
        // ==========================================================
        // END OF SHEET
        // ==========================================================
    }
}


