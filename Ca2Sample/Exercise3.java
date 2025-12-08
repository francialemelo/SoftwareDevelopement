package Ca2Sample;
import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
     Scanner input= new Scanner(System.in);

     int number ;

     System.out.print("Enter a number");
     // number=input.nextInt();
     if (input.hasNextInt()) {
        number=input.nextInt();

      if(number>10){
        System.out.print(number+" is greater than 10");


      }else{
        System.out.print(number+" is NOT greater than 10");
      }

    }else{
      System.out.print("NOT a valid number");  
    }
    input.close();
    }
}
