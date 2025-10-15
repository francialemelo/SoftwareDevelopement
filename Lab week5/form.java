import java.util.Scanner;

public class form {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     String name, email;
     int phone;

System.out.print("Your name: ");
name= input.nextLine();
System.out.print("Your Phone Number: ");
phone = input.nextInt();
System.out.print("Your email: ");
email= input.next();

    String number = Integer.toString(phone);
    number = "(0" + number.substring(0,2) + ") " + number.substring(2);

    System.out.println("Number updated to:" + number);

    }
    
}
