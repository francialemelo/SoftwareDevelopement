import java.util.Scanner;
public class Arithmetic1 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int a,b,c,d,e ;

          System.out.println("Enter a number for A:");
          a=input.nextInt();
          System.out.println("Enter a number for B:");
          b=input.nextInt();
          System.out.println("Enter a number for C:");
          c=input.nextInt();
          System.out.println("Enter a number for D:");
          d=input.nextInt();
          System.out.println("Enter a number for E:");
          e=input.nextInt();
         
          System.out.println();

         /*
         Add 9 to number assigned to a.
        - Subtract 4 from number assigned to b.
        - Multiply number assigned to c by 3.
        - Divide number assigned to d by 2.
        - Calculate the remainder of number assigned to e when it is divided by 5.
        */
              
       

        System.out.println("Value of a, "+ a + " , after adding 9 is "+ (a +=9));
        System.out.println("Value of b, "+ b + " , after subtract 4 is "+ (b -=4));
        System.out.println("Value of c, "+ c + " , after Multiply by 3 is "+ (c *=3));
        System.out.println("Value of d, "+ d + " , after Divide by 2 is "+ (d /=2));
        System.out.println("Remainder value of e, "+ e + " , after divided by 5 is "+ (e %=5));

        input.close();









        
    }
    
}
