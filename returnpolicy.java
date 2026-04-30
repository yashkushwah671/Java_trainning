import java.util.*;

public class ReturnPolicy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int days = sc.nextInt();
        String defective = sc.next();
        String premium = sc.next();

        if (defective.equalsIgnoreCase("Yes") || 
           (premium.equalsIgnoreCase("Yes") && days <= 15) || 
           days <= 7) {
            System.out.println("Return Accepted");
        } else {
            System.out.println("Return Rejected");
        }
    }
}