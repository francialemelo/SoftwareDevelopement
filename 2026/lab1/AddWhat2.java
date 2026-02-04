import java.util.Scanner;

public class AddWhat2 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
          double number = scanner.nextDouble();
        double result;
        
        System.out.print("Enter a number: ");
      
        if (number > 100) {
            result = number * 10;
        } else if (number > 75) {
            result = number * 8;
        } else if (number > 50) {
            result = number * 6;
        } else if (number > 25) {
            result = number * 4;
        } else {
            result = number / 2;
        }

       
        System.out.println("Result: " + result);
        
      
        scanner.close();
    }
}
