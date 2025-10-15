import java.util.Scanner;

public class lab5_Inputs {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     double num;
     String name; 
     int numi;

     System.out.print("Enter Yor first name: ");
     name= input.next();
     System.out.print("Enter a whole Number: ");
     numi= input.nextInt();
     System.out.print("Enter a decimal Number: ");
     num= input.nextDouble();
     

     System.out.println(name +", you entered the number :" + numi + " and " + num);
        
    }
    
}
