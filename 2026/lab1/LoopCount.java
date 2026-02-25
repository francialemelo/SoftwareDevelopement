/*Write a program, LoopCount.java, which implements a sentinel controlled while loop. On each loop,
or iteration, the user should be prompted whether to loop again. If the user chooses not to loop
again then the loop ends and the number of times the loop code was executed is printed to the
screen.
An example output is as follows:*/
 import java.util.Scanner;
 public class LoopCount{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count=0,flag=0;
        System.out.print("want to loop: ebter 0 for yes , 1 fir no:");
        if(input.nextInt()!=0){
            flag=1;
        }
        while(flag==0){
          System.out.print("Loop Again: Enter 0 for yes,1for No");
          if(input.nextInt()!=0){
            flag=1;
        }
        count++;
            
        }
 System.out.println("you looped "+count+ "times");
 input.close();
        

    }
 }
