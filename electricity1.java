import java.util.*;
public class electricity1{
   Scanner Sc= new Scanner(System.in);
   
   system.out.println("enter the unit consumption");
    float electricitybill = 50 ; 
    int units  ;
    units = sc.nextInt();

    if(units <= 100 ){
        electrictybill += units* 1.5;
    }
    else if (units <= 200){
        electrictybill += units* 3.5 ;
    
    }
    else {z
        electrictybill = units * 5:

    }
    while(electricitybill <= 20000){
        electricitybill = electricitybill * 1.1;
    }

     system.out.println("total bill" + electricitybill);
     sc.close();
}

// Prince Verma
// 3:06 PM
// import java.util.*;
// public class ELECTRICIY {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int units = sc.nextInt();
//         double bill =50;

//         if(units <100){
//             bill += units *1.5;
//         }
//         else if(units <200){
//             bill += 100*1.5 + (units-100) *3.5;
//         }
//         else{
//             bill += 100*1.5 + 100 *3.5 + (units-200)*5;
//         }

//         if(bill>2000){
//             bill = bill *1.1;
//         }
//         System.out.println("Total Bill : "+ bill);
//         sc.close();
//     }
// }
