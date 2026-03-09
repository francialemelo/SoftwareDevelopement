public class Exercise6 {
    public static void main(String[] args) {
          for (int i=1;i<=5; i++){
            for(int j = 1 ; j<=i ; j++ ){
                System.out.print(j+ " ");
               
            }

         System.out.println();
    }
     System.out.println("PART B");
     int counter = 10;
     for (int i = 1; i <=6;i++ ){
       for (int j=1; j<=i; j++ ){
        System.out.println(counter ++ + " ");
       }
       counter=10;
       System.out.println();
     }
  System.out.println("PART C");
   counter = 10;
     for (int i = 1; i <=6;i++ ){
       for (int j=1; j<=i; j++ ){
        System.out.println(counter++ + " ");
       }
       counter=10;
       System.out.println();
     }
    }
}