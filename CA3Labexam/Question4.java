package CA3Labexam;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        
 
     Scanner input = new Scanner(System.in);
     String text ;
     int loop;

     System.out.print("Enter some text: ");
     text = input.nextLine();
     loop = text.length();

     for( int i = 1; i <= loop; i++){
        System.out.println(text);
      
     }
     input.close();

}
   }