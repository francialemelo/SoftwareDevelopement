package CA3Labexam;
import java.util.Scanner;
public class Question2 {
public static void main(String[] args) {
     int number ;
     Scanner input = new Scanner(System.in);
      System.out.print("Enter number: ");
      number = input.nextInt();
    
    if (number>=4) {
         for (int i = 1; i <= 4; i++) {
            System.out.println(i+". Question 2");
         }

    }else{
        for (int i = 1; i <= 2; i++) {
              System.out.println(i+". Question 2");

    }
}
   input.close();     
}
}    
