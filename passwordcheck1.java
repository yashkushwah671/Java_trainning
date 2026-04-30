import java.util.*;
public class passwordcheck1{
static String passwordcheck(String password){
 if(password.length()<8 )
 {
    return false ;
 }  

}

    public static void main ( String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter password");
   String  password = sc.nextLine();
   
   if (passwordcheck(password))
    {
    System.out.println("valid password");
   } else {
    System.out.println("invalid password");
   }
   sc.close();
    }
}
