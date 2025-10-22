import java.util.Scanner;

public class SubStr {
 public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String word;
        //double num3=0, rounded=0;

        System.out.println("enter a Word ");
        word=input.next();

        System.out.println("the first 4 Charateres in " + word +  " are " + word.substring(0,4));
        input.close();
    }
    
}


