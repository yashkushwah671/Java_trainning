import java.util.*;

public class fibonaci {

    static void printfibonacci(int n){
        int a =0,b= 1;

        for (int i=0; i <n; i++){
            System.out.println(a+ "");
            int next= a +b;
            a=b;
            b=next ;
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of terms");
        int n = sc.nextInt( );

        printfibonacci(n);

    }
}
