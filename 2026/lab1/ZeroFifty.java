/*Write a program, ZeroFifty.java, which uses a do while loop to keep asking for a number between 0
and 50. If a number outside of that range is entered, the program ends. An example out from this
program is as follows: */
import java.util.Scanner;
public class ZeroFifty {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int  number=0;

        do{
            System.out.println("Enter a number between 0-50");
            number=input.nextInt();
        }while(number>0&& number <50);
        System.out.println("end");
        input.close();
        }
    }

