package CA3Labexam;

import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
     
     int number , total=0 ;
     Scanner input = new Scanner(System.in);

    do{
      System.out.print("Enter a positive number (enter Value less than 1 to stop): ");
      number = input.nextInt();
      if (number > 0){
      total ++;
      }
      }while(number > 0);
      
     System.out.print("you entered " + total + " positive number. ");

      input.close();



    }
      
}



