import java.util.*;
public class parking {
    Scanner Sc= new Scanner(System.in);
    System.out.println("enter total no hours");
    hours = sc.Double();  
    double bill;  

    if(hours<=2){
        bill = hours * 100 ;
    }
    else if (hours <= 5){
        bill = 2*100+(hours-2)*50;
    }
    else{
        bill= 2*100 + 3*50 (hours-5)*25;
    }
     system.out.println("total bill" + bill);
     sc.close();
     
}
