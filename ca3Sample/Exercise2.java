/* Write a program, named Exercise2.java, which implements a loop to output the first three
months of the year. On the first iteration, print “January”, on the second iteration, print
“February”, and on the third iteration, print “March”.
Example output is as follows: */
public class Exercise2 {
    public static void main(String[] args) {
        // Loop from 1 to 3
        for (int i = 1; i <= 3; i++) {
            switch (i) {
                case 1:
                    System.out.println("January");
                    break;
                case 2:
                    System.out.println("February");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                default:
                    break;
            }
        }
    }
}
