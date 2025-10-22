import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    String unit;
    double num1=0, num2=0;
    //int num1=0, num2=0;
     //double num3=0, rounded=0;

        System.out.print("Enter the lenght of the retangle: ");
        num1=input.nextDouble();


        System.out.print("Enter width of the retangle: "); 
        num2=input.nextDouble();

        System.out.print("Enter the measurement unit of the retangle: ");
        unit=input.next();


         System.out.println("The area of the retangle is  "+ (num1*num2)+ " " + unit +  " square");

        //System.out.println("the correct for of  " + word +  " is  " + word.replace("x","u"));
        input.close();
    
}
    
}
