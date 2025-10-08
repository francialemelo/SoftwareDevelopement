public class Cat {
    public static void main(String[] args) {
        /*“In 2040 NASA are planning to send a cat to the moon in a rocket. 
        Could be dangerous for the cat. Odds for the cat surviving are 2.5 to 1.”*/

        int year = 2040; 
        String org = "NASA", pet = "cat" , place = "Moon" , vehicle = "rocket";
        double odds = 2.5 ;

        String output = "In " + year  + " " + org + " are planning to send a "  + pet + " to the " + place + " in a " + vehicle + ". \n" ;
       output = output + "Could be dangerous for the "  + pet + ". Odds for the cat surviving are " + odds + "  to 1.";

        System.out.println(output);
        

    }
    
}
