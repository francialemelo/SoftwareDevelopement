package CA3Labexam;
// usin scanner to get the text prompt by the user
import java.util.Scanner;
public class Question1 {
public static void main(String[] args) {
    //declaring my text variable
    String text ;
     Scanner input = new Scanner(System.in);
      System.out.print("Enter some text: ");
      text = input.nextLine();
     int i = 1 ;
     //using while loop to get the text reppeted 11 times
        while (i<=11){
            System.err.println(i+ ". " + text );
            i++;
        }
        input.close();
    }

}
    

