package lab11;
import java.util.Scanner;
public class exercise1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int year;
        System.out.print("Enter a year");
        year=input.nextInt();

        if (year%4==0) {
          System.out.println(year+ " is a leap year");

        }else{
            System.err.println(year+ " is NOT a Leap year");
        }
        input.close();
    }
    
}
