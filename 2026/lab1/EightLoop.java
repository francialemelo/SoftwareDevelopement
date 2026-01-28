import java.util.Scanner;
public class EightLoop {
    public static void main(String[] args) {     


        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int i = 1;
        
        while (i <= 5) {
            int result = number * i;
            System.out.println(number + " TIMES " + i + " = " + result);
            i++;
        }

        scanner.close();
    }
}

     