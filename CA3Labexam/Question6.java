package CA3Labexam;

public class Question6 {
    public static void main(String[] args) {
         System.out.println("Part A:");
          System.out.println("------");
        
          for(int row = 1; row <= 4; row++){
            System.out.print("line "+ row + ": " );
            for(int column = 1; column <=4; column++){
               System.out.print(column +" " ); 
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Part B:");
        System.out.println("------");
       
        
        for(int i = 4; i >= 1; i--){
            System.out.print("line "+ i   + ": ");
            for(int j = 4; j >= 1; j--){
                System.out.print(j + " " ); 
            }
            
            System.out.println();
        }
    }
    
}
