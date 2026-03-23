public class SeventhArray {
   public static void main(String[] args) {
   int[] x = {23, 104, 3, 65, 1002, 9000, 72, 88, 99, 10};
   int [] ix = new int [x.length];
for (int i=x.length-1,j=0;i>=0;i--,j++){
     ix[j]= x[i];

}
    for (int i = 0; i <= x.length  ; i++) {
        System.out.print(ix[i] + ",");
            
            }
        }


   }  

