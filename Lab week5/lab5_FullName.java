import java.util.Scanner;

public class lab5_FullName {
    public static void main(String[] args) {
        
Scanner input = new Scanner(System.in);
String fn, ln ;

System.out.print("Enter First Name: ");
fn= input.next();
System.out.print("Enter Last Name: ");
ln= input.next();

System.out.println(fn + "   " + ln);
//System.out.println(ln.concat("").concat(fn));
System.out.println("Hello," + fn.substring(0,1).toUpperCase() + fn.substring(1).toLowerCase()+
                  " " + ln.substring(0,1).toUpperCase()+ln.substring(1).toLowerCase()); 
input.close();

        
    }
    
}
