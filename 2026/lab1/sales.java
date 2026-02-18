/*Exercise 7:
Write a program, Sales.java, which calculates the sales commission for a sales person in a company.
Each salesperson receives €200 per week plus 9% of their gross sales that week. For example, a
salesperson who sells €5000 worth of merchandise in a week receives €200 plus 9% of €5000, or a
total of €650.
The value of the items a salesperson can sell are as follows:
Item 1: €239.99
Item 2: €129.75
Item 3: €99.96
Item 4: €350.89
The program should implement a for loop to prompt the user to enter number of each item sold by a
salesperson, and then calculate their total income for that week (€200 plus 9% of total sales).
An example output from this program is as follows:
Use Math.round() on the output for earnings, 
to round the earnings up to the nearest euro. */

import java.util.Scanner;
public class sales {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double gross = 0;
        int qty;
        for(int i=1; i<=4;i++){
            System.out.println("Qantity sold of product"+ i + ": ");
            qty= input.nextInt();

            if (i == 1) {
                gross +=qty * 239.99;
            }else if(i == 2) {
                gross +=qty *129.75;

            }else if(i == 3){
                gross +=qty * 99.96;
 
            }else if(i == 4){
                gross +=qty * 350.89;
 
            }
         


        }
    System.out.println("earnungs this week: "+ gross);
       
    }
    
}





