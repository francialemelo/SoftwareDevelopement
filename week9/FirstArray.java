package week9;

public class FirstArray {
    /*Write a program, FirstArray.java, which implements the following array:
Using a loop which uses the length property of an array in the condition, print the values from this
array to the screen.
 */

public static void main(String[] args) {
    int[] x= new int[4];
    int i=0;
    while (i < x.length){
        System.out.print(x[i] + " ");
        i++;

    }
    System.out.println();
}
    
}
