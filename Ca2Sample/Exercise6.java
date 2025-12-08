package Ca2Sample;
import java.util.Scanner;
public class Exercise6{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        double salary=0, taxed=0,bonus=0;

        System.out.println("Enter your Annual Salary");
        salary = input.nextDouble();  
        
        System.out.println("Enter your Bonnus");
        bonus = input.nextDouble();         
        
        
 /*First 30,000 is taxed at 25%.
- Any earnings between 30,000 and 100,000 is taxed at 35%.
- Any earnings above 100,000 thousand is taxed at 50%.
- Bonus is taxed at 40% */

bonus=bonus*0.4; 

if(salary<=30000){
    taxed= salary*0.25;
    salary=(salary + bonus) -taxed;
    


}else if(salary>30000 && salary<=100000 ) {
    taxed= salary*0.35;
    salary=(salary + bonus) -taxed;
    


}else if(salary>100000){
    taxed= salary*0.5;
    salary=(salary + bonus) -taxed;
    

}
System.out.println();
System.out.println("Gross Salary"+ salary);
System.out.println("Bonus"+ bonus);
System.out.println("Taxes due: "+ taxed);
System.out.println("net Pay: "+ salary );

input.close();    
    }
    
}
