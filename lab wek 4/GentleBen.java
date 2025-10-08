public class  GentleBen {
    public static void main(String[] args) {
    /*The original novel told the story of the friendship between a large male bear named Ben and a boy
named Mark. The story provided the basis for the 1967 film Gentle Giant (1967),  the popular late
1960s U.S. television series Gentle Ben, a 1980s animated cartoon and two early 2000s made-for-TV
movies */
    

        int year1 = 1967 , year2 = 1960 , year3 = 2000, year4= 1980; 
        String theme = "friendship", book = "novel" , name1 = "Ben" , name2 = "mark" ;
        //double odds = 2.5 ;

        String output = "The original " + book  + " told the story of the " + theme + " between a large male bear named "   ;
        output = output + "a boy \nnamed  "  + name2 + ". The story provided the basis for the  " + year1 + " film Gentle Giant (" + year1 + " ) ";
        output = output + ", the popular late \n" + year2 +"s U.S. television series Gentle Ben, a" +year4 +"s animated cartoon and two early" ;
        output = output + year3 + "s made-for-TV movies"; 

        System.out.println(output);
        



    }
    
    
}
