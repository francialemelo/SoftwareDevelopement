package lab11;
import java.util.Scanner;
public class exercise2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num;

        System.out.print("Enter a Number");
        num=input.nextInt();
        // ((num>= 1 &&  num<= 10)|| (num>= 50 &&  num<= 100) )
         if (num>= 1 &&  num<= 10) {
          System.out.println(num+ " is in the range");

        }else if (num>= 50 &&  num<= 100) {
            System.err.println(num+ " is in the range");
        }else{
            System.err.println(num+ " is NOT in the range");

        }
    input.close();
    }
    
}
