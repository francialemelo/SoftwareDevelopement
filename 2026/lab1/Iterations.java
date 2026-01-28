import java.util.Scanner;
public class Iterations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String output ="";
        int i=1 , number=0 ,result=0;

        while(i<= 3){
            System.out.println("Enter a number " + i + ":");
            number= input.nextInt();
            output += number + "||" ;
            result += number ;

            i++;


        }
        output= output.substring(0, output.length()-3);
         //System.out.println("Numbers entered are " + output + ":");
           System.out.println(output + " = " + result);
         input.close();
    }
    
}
