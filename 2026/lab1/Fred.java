/*Consider the following statement:
“Fred is 12 years old. His favourite sport is Football.”
This statement contains a number of values. Identify the important values from the above statement
and assign those values to variables of the appropriate type.
Once the variables are declared and values assigned to them, reconstruct the above statement using
the variables. Output the reconstructed statement to the screen.
All the code for this exercise should be placed in a file named Fred.java.  */

public class Fred {
    public static void main(String[] args) {
        String name = "Fred", sport="fotball";
        int age = 12;

        System.out.println(name+ " is " +age + " years old. His favourite sport is "+ sport);
    }
    
}
