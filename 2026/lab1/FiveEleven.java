public class FiveEleven {
    public static void main(String[] args) {
        
        String divBy5 = "";
        String divBy11 = "";
        String divByBoth = "";

        
        for (int i = 1; i <= 50; i++) {
            
            if (i % 5 == 0 && i % 11 == 0) {
               
                if (divByBoth.isEmpty()) {
                    divByBoth += i;
                } else {
                    
                    divByBoth += ", " + i;
                }
            }
            
            if (i % 5 == 0) {
                if (divBy5.isEmpty()) {
                    divBy5 += i;
                } else {
                    divBy5 += ", " + i;
                }
            }
            
            if (i % 11 == 0) {
                if (divBy11.isEmpty()) {
                    divBy11 += i;
                } else {
                    divBy11 += ", " + i;
                }
            }
        }

        
        System.out.println("Numbers divisible by both 5 and 11: " + divByBoth);
        System.out.println("Numbers divisible by 5: " + divBy5);
        System.out.println("Numbers divisible by 11: " + divBy11);
        
    }
 
    }
    

