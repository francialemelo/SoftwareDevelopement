package Lab8;
import java.util.Scanner;
public class Sign {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

    System.out.print("Input number: ");
    number=input.nextInt();

    if (number > 0) {
    System.out.println(number + " is a positive number.");
    } 
if (number < 0) {
    System.out.println(number + " is a negative number.");
} 
if (number == 0) {
    System.out.println(number + " is 0.");
}
input.close();
    }

}




