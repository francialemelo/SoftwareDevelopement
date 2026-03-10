package CA3Labexam;

/*Write a program, named Exercise4.java, which implements a loop to print out all the even
number values from 20 to 10, so that on the first iteration, 20 is printed, on the second iteration,
18 is printed, etc. Print the result of adding all these numbers together. The output to the screen
should be all on one line and the same as the following: */
public class Exercise4 {
    public static void main(String[] args) {
        int i = 20;
        int total = 0;
        while (i>=10){
            System.out.print(" " + i + " +");
            total +=i;
            i -=2;

        }
        System.out.print(" = " + total );

    }
    
}
