public class TenthLoop {
    public static void main(String[] args) {
    int square, cube;
    int num = 1;

          System.out.printf("%s\t%s\t%s%n", "Number", "Square", "Cube");

       
        while (num <= 10) {
             square = num * num;
             cube = num * num * num;
            
           
            System.out.printf("%d\t%d\t%d%n", num, square, cube);
            
            num++; 
        }
    }
    
}
