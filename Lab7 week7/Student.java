import java.util.Scanner;

public class Student {

    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    String name, id;
    double grade;
    int age;
     //double num3=0, rounded=0;

        System.out.print("Enter name: ");
        name=input.nextLine();

        System.out.print("Enter id number: ");
        id=input.nextLine();

        System.out.print("Enter average Grade: ");
        grade=input.nextDouble();

        System.out.print("Enter age: ");
        age=input.nextInt();

        System.out.println("+-----------------------------------------+");
        System.out.println("|" + name + " |" + id + " |" + grade+ " |" + age + " |");
        System.out.println("+-----------------------------------------+");

        //System.out.println("the correct for of  " + word +  " is  " + word.replace("x","u"));
        input.close();
    
    }
}