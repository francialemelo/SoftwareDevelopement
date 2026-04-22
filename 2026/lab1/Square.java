import java.util.Scanner;
public class Square {
    static int squareOf(int val){
        return val*val;
    }

    public static void main(String[] args) {
    
     System.out.println("Number\t Square");
     System.out.println("+++++++\t+++++++");
     for(int i=2;i<=7; i++){
        System.out.println(i+"\t" + squareOf(i) );
     }
        
        
    }


    
}
