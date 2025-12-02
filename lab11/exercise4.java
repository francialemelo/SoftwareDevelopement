package lab11;
import java.util.Scanner;
/*Write a program that simulates a traffic light system. The program should take a colour as input
(red, yellow, green) and print the corresponding action:
• Red: Stop
• Yellow: Ready
• Green: Go */
public class exercise4 {
     public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String cores;

        System.out.print("Enter colour among (red, yellow, green)");
        cores=input.next();

         System.out.print(cores);

       if (cores.equals("red")) {
            System.out.print(cores+ ": STOP");
        }
        
       else if (cores.equals("yellow")){

       System.out.print(cores+ ": Ready");
    }

       else if (cores.equals("green")){
       System.out.print(cores+ ": Go");
    }else {
         System.out.print(cores+ ": is not working");
    }

       input.close();
    
    }
    }
        
 
    

