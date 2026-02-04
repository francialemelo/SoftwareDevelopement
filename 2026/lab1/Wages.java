import java.util.Scanner; 
public class Wages {
public static void main(String[] args) {
Scanner input = new Scanner(System.in); 
for (int i = 1; i <= 3; i++) {
System.out.println("Employee " + i);
System.out.print("Enter hours worked: ");
double hours = input.nextDouble();
System.out.print("Enter hourly rate: ");
double rate = input.nextDouble(); 
double totalWages;
if (hours > 40) {
double overtimeHours = hours - 40;
totalWages = (40 * rate) + (overtimeHours * rate * 1.5);
} else {
totalWages = hours * rate;
} 
System.out.println("Total wages for employee " + i + ": €" + totalWages);
System.out.println();
}
input.close();
}
}
