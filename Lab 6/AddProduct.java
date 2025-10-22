import java.util.Scanner;

public class AddProduct {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    //String word;
    //double num3=0, rounded=0;
     int num1=0, num2=0, num3=0;
     //double num3=0, rounded=0;2
    

        System.out.print("Enter first int number: ");
        num1=input.nextInt();


        System.out.print("Enter second int number: ");
        num2=input.nextInt();

        System.out.print("Enter third int number: ");
        num3=input.nextInt();

        System.out.println(num1+" + "+num2+" + " + num3 + " = "+ (num1+num2+num3));
        System.out.println(num1+" x "+num2+" x " + num3 + " = "+ (num1*num2*num3));

        //System.out.println("the correct for of  " + word +  " is  " + word.replace("x","u"));
        input.close();
    
}
    
}
