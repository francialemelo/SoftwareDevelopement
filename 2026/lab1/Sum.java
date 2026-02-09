public class Sum {
    public static void main(String[] args) {
        int total=0,odd=0,even=0, i=0;

        while (i<=100) {
           total=total+i;
            if(i%2==0){
             even=even+i;        

            }else{
              odd+=i;   
            }
            i++;
        }
        System.out.println("Sum of number 1 to 100 is: " + total);
        System.out.println("Sum of even numbers 1 to 100 is: " + even);
        System.out.println("Sum of odd 1 to 100 is: " + odd);

         if (odd>even) {
            odd=odd-even;
            
         }else{
            odd = even - odd;
         }
         System.out.println("Diference: "+ odd);
    }
}
