import java.util.Scanner;
public class FirstChar {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String word;
        //double num3=0, rounded=0;

        System.out.println("enter a Word ");
        word=input.next();

        System.out.println("the First of Charater in " + word +  " is " + word.charAt(0));
        input.close();
    }
        
    }
    

