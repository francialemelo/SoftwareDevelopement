import java.util.Scanner;
public class Vowels {
public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

        String text;
        int total = 0;
        String vowels = "aeiouAEIOU";

        System.err.println("Enter a word");
        text=input.nextLine();


        for (int i = 0; i < text.length(); i++) {
            if (vowels.indexOf(text.charAt(i)) != -1) {
                total++;
            }
        }
        System.out.println("Total de vogais: " + total);
        input.close();
    }
}


  


    
