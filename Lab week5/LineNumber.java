import java.util.Scanner;

public class LineNumber {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     int linenumber=0;
     String sentence; 
    
     System.out.print("Enter a line number: ");
     linenumber= input.nextInt();

     input.nextLine();

     System.out.print("Enter a sentence: ");
     sentence= input.nextLine();
     
     System.out.println(linenumber +".  " + sentence);
          
        
    }
    
}
