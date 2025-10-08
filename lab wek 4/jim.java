public class jim {
    public static void main(String[] args) {
    /*Jim is a 40-year-old man. Life is tough on Jim. He works as a plumber. He is divorced and has 8
children. He earns 700 a week but needs 800 a week to support his ex-wife and children. He was
hoping to pass an exam which would enable him to earn more, but unfortunately poor Jim failed it
with a score of 27.5*/
    

        int age = 40 , age2 = 8 , wage = 700 , wage2= 800; 
        String job = "plumber", status = "divorced" , name1 = "jim" ;
        double score = 27.5;

        String output = name1  + " is a  " + age + " -year-old man. Life is tough on " + name1 + " He works as a " + job + "." ;
        output = output + "He is" + status + " and has "  + age2 + "\nchildren. He earns " + wage + "  week but needs" + wage2 + " a week to support his ex-wife and children. He was ";
        output = output + "\nhoping to pass an exam which would enable him to earn more, but unfortunately poor Jim failed it\n"  ;
        output = output + "with a score of " +score; 

        System.out.println(output);

    }
}   

