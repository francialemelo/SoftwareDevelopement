import java.util.Scanner;

public class AddWhat3 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        double result = 0;
        
        System.out.print("Enter a number: ");
        

        
        if (number > 100) {
            result = number + 10;
        } else if (number > 50) {
            result = number + 5;
        } else if (number > 20) {
            result = number + 2;
        } else {
            result = number + 1;
        }

        System.out.println("Result: " + result);

        
        scanner.close();
    }
}
