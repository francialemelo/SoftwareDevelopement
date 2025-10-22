import java.util.Scanner;
public class Addition {
     public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    //String word;
    //double num3=0, rounded=0;
     int num1=0, num2=0;
     //double num3=0, rounded=0;

        System.out.print("Enter first int number: ");
        num1=input.nextInt();


        System.out.print("Enter second int number: ");
        num2=input.nextInt();

        System.out.println(num1+" + "+num2+" = "+ (num1+num2));

        //System.out.println("the correct for of  " + word +  " is  " + word.replace("x","u"));
        input.close();
    
}
}
