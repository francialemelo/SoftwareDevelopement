import java.util.Scanner;
public class Average {
       static double avg(int x, int y, int z){
        double res= 0;
        res=y+z+x;
        res/=3;
        return res;

    }
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     int num1,num2,num3;
     System.out.print("Enter first number: ");
        num1= input.nextInt();
        System.out.print("Enter second number: ");
        num2= input.nextInt();
        System.out.print("Enter third number: ");
        num3= input.nextInt();
        System.out.print("Averege:"+ avg(num1,num2,num3));



        input.close();  
        
    }
    
 
}
