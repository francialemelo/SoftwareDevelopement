import java.util.Scanner;

public class NinthLoop {
     public static void main(String[] args) {     


        Scanner scanner = new Scanner(System.in);
        int grade, total = 0;
        int i = 1;

        while (i <= 5) {
        System.out.println("The grade for Student " + i);
        grade = scanner.nextInt();
        total = grade + grade;
        i++;

        }
        
         System.out.println("Total Grade is " + total );
          System.out.println("average Grade is " + (total/5) );
         

        scanner.close();
    }
}

    


