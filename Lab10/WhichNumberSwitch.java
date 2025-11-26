package Lab10;
import java.util.Scanner;
public class WhichNumberSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0;

    System.out.print("Enter a number: ");
    num1=input.nextInt();

     switch (num1) {
            case 1:
                System.err.println("1");
                break;
                  case 2:
                System.err.println("2");
                break;
                  case 3:
                System.err.println("3");
                break;
                  case 0:
                System.err.println("0");
                break;        
            default:
               System.err.println("Not allowed"); 
                break;
        }

        input.close();
    }
    
}
