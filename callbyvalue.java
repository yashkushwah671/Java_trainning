import java.util.Scanner;
public class callbyvalue {
   // Scanner sc = new Scanner (system.in);
   static void add(int a , double b,String  msg )
    {
        a = 50;
        b=80.0 ;
        double c = a+b;
        msg = "hellow";
        
        System.out.println(c);
    }
    public static void main(String[] args) {
        int a = 10;
        double b= 20;
       String  msg = "hi";
        //callbyvalue c= new callbyvalue();
        add(a,b,msg);
       
        System.out.println("a :" +a);
        System.out.println("b :" +b);
        System.out.println("msg :" +msg);
    }
    
}
