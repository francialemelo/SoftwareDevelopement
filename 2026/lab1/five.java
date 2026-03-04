/*Write a program, Five.java, which implements a loop to print out all numbers from 1 to 50 which are
divisible by 5. See example screenshot of output below:
Note: No trailing comma in output – “50”, not “50,” */

public class five {
    public static void main(String[] args) {
        System.out.println("Diviseble by 5:");
         for (int i = 1; i <= 50; i++) {
            
            if (i % 5 == 0) {
                
                System.out.print(i);
                
                if (i != 50) {
                    System.out.print(", ");
                }
            }
        }
        
        System.out.println();
    }
    
}


