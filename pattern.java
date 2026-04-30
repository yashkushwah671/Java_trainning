import java.util.*;
public class pattern {
    public static void main(String[] args) {
        int i,j;
        System.out.println("enter the no");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        for ( i = 1;i<=n ;i++)
        {
            for (j=1;j<i*2;j++){
                System.out.print(" *");
            }
                System.out.println();
        }
    }
}
