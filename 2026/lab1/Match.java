import java.util.Scanner;
public class Match {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in)  ;

    String st1, st2 ;

    System.out.println("Enter First String:");
    st1=input.nextLine();
    
    System.out.println("Enter second String:");
    st2=input.nextLine();


    if (st1.equals(st2) ) {
        System.out.println("They mach");


    }else{
        System.out.println("They don`t mach");
    }


    input.close() ;


}
    
}
