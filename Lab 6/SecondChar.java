import java.util.Scanner;
public class SecondChar {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String word;
        //double num3=0, rounded=0;

        System.out.println("enter a Word ");
        word=input.next();

        System.out.println("the Second of Charater in " + word +  " is " + word.charAt(1));
        input.close();
    }
}




    
        
    
    

