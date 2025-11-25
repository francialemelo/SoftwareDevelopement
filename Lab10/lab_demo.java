package Lab10;

public class lab_demo {
    public static void main(String[] args) {
        int grade =85;
        int level = 0;
        int age=18;
        boolean hasID = false;
        boolean isWeekrnd=true, isHolidays=false;

        if (age >= 18 && hasID){
            System.err.println("You may enter");
            
        }else{
            System.err.println("You NOT enter");
        }
        if (isWeekrnd || isHolidays){
            System.err.println("Relax");   
        }else{
           System.err.println("keep working");   
        }


       if ((age>=18 && hasID)|| isHolidays){
        System.err.println("and and or togher = true");
       }else{
         System.err.println("and and or togher = false");

       }

        if (grade >= 70) {
           System.err.println("first class honours");
           level=1;
        }
        else if (grade>=60) {
            System.err.println("second class honours higher");
            level=2;
        }
        else if (grade>=50) {
            System.err.println("second class honours lower");
            level=3;
        }
        else if (grade>=40) {
            System.err.println("pass");
            level=4;
        }
        else {
            System.err.println("FAIL");

        }
        switch (level) {
            case 1:
                System.err.println("1.1");
                break;
                  case 2:
                System.err.println("2.1");
                break;
                  case 3:
                System.err.println("2.2");
                break;
                  case 4:
                System.err.println("3");
                break;        
            default:
               System.err.println("F"); 
                break;
        }

        }
    }
    
