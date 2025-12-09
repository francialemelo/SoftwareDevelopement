package Ca2labexam;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        
   
    Scanner input= new Scanner(System.in);
    int time ; 
    String metric;
    double distance, peace=0;

    System.out.print("Enter target time im minutes ");
    time=input.nextInt();
    System.out.print("preferd Metric \n a- miles \n b- kilometres \n enter a or b ");
    metric=input.next();
     System.out.print("Enter target distance in kilometres ");
    distance=input.nextDouble();

    //v= metric/time 
    if (metric.equals("a")){
        metric="Miles";
       peace=time/distance;

    }else if (metric.equals("b")) {
        metric="kilometres";
        peace=time/distance;

    }else{
        System.out.print("Metric is not Valid");
    }

    System.out.print("peace required to run "+distance +" "+  metric + " in " + time + " minutes is "+ peace + " per " + metric);
    
input.close();
}

 }