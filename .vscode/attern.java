// public class pattern {
//     public static void main(String[] args) {
//         int i,j;
//         int n=6\;
//         for (i = 1;i<=n;i++){
        
//             for(j=1; j<=n-i;j++){
//              System.out.print("_ "); 
//              //k++;  
//             }
//             for(j=1; j<=i;j++){
//              System.out.print( i+ " _ ");
//             }
//            System.out.println(); 
//         }
     
//     }
    
// }
public class attern
{
    public static void main(String[] args) {
         int i,j;
         int n=6;
         for(i=1; i<=n; i++)
         {
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(j=1; j<=i; j++)
            {
                System.out.print(i+ " ");
            }

            System.out.println();
         }
         for(i=n-1;i>=1;i--){
            for (j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print( i+ " ");
             }
                System.out.println();
         }
    }
}