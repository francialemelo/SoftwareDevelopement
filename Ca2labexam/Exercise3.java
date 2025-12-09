package Ca2labexam;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int num = 0 ;
        System.out.print("Enter a number");
        num=input.nextInt();

        if (num <100) {
            System.out.print(num+"Is less than 100");


        } else {

           System.out.print(num+"Is not less than 100");
 
        }
    input.close();
    }
    
}
