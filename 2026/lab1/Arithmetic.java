import java.util.Scanner;
public class Arithmetic {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int first, second, third, result;

    System.out.print("Enter First Number:");
    first=input.nextInt();
    
    System.out.print("Enter second Number:");
    second=input.nextInt();

    result = first+second;

    System.out.println(first+ " + " + second + "= " + result  );
     
    third= 10 ; 
    System.out.print(result);
    //result = result +third;

    result += third;

    System.out.println(" + " + third + "= " + result  );


     int number =  5;
     System.out.println("aqui"+ number);
     System.out.println(number++);
     System.out.println(number);
     System.out.println(++number);
     number--;
     System.out.println(number);
     System.out.println(--number);

     number +=  4;
     System.out.println(number);
     number -=  2;
     System.out.println(number);
     number *=  3;
     System.out.println(number);
     number /=  3;
     System.out.println(number);
     number -=  2;
     System.out.println(number);

    input.close();
        
    }
}