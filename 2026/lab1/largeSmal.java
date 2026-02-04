import java.util.Scanner;
public class largeSmal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int large=0, small=0, number=0,counter=0;

        while (counter<=5) {
            System.out.print("Enter a Int number");
            number= input.nextInt();
            if (number> 0){
                if (counter==1) {
                    large=number;
                    small= number;

                }else{
                
                if (number>large){
                    large=number;

                }
                if (small> number){
                    small = number;

                }

            }
            counter ++;
            }else{

            System.out.println("number must be Positive");
            }
        }

        System.out.println("Large: " + large);
        System.out.println("Small: " + small);
        input.close();

    }
}
   

