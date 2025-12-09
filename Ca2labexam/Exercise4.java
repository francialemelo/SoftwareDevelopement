package Ca2labexam;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num = 0 , num2;
        System.out.print("Enter a number");
        num=input.nextInt();
        /*Number entered is a value from 1 to 10, then subtract 10 from the number. 
- Number entered is a value from 21 to 30, then subtract 30 from the number. 
- Number entered is a value from 41 to 60, then subtract 60 from the number. 
- Number entered is a value from 71 to 75, then subtract 75 from the number. 
- Number entered is not in any of the ranges specified above, then subtract 2 from the 
number. */

        if (num >=1 && num<=10){
             num2= (num-10);
             System.out.print(num+ "iupdated to "+num2);

        } else if (num >=21 && num<=30) {
            num2= (num-30);
            System.out.print(num+ "iupdated to "+num2);
        } else if (num >=41 && num<=60) {
            num2= (num-60);
            System.out.print(num+ "iupdated to "+num2);

        }else if (num >=71 && num<=75) {
            num2= (num-75);
            System.out.print(num+ "iupdated to "+num2);
        }else {
          System.out.print(num+ "is not in any of the ranges");
          num2 = (num-2);
          System.out.print("updated to " + num2);


        }


input.close();
        
    }
    
}
