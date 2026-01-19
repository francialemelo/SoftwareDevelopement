import java.util.Scanner;
public class Lecture {
    public static void main(String[] args) {
        int age;
        String name;
        Double pie;
        Scanner input = new Scanner(System.in);
    
    
    System.out.print("Enter Your name:");
    name=input.nextLine();
    System.out.print("Enter Your age:");
    age=input.nextInt();
    System.out.print("Enter a Value Pi to 5 decimal places:"); /* 3.14159*/
    pie=input.nextDouble();

    System.out.println(name+ " Is " + age + "." );
    System.out.println("Pi rounded to 5 decimal places is: "+ pie);
    System.out.println("Pi rounded to 4 decimal places is: " + Math.round(pie*10000)/10000.0);
    System.out.printf("Pi2 rounded to 4 decimal places is: %.4f%n", pie);
    System.out.printf("My name is %s%n", "Fran",age);
    input.close();






        
    }




    
}