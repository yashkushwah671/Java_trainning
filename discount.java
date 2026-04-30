import java.util.*;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double amount = sc.nextDouble();
        String premium = sc.next();

        double discount = 0;

        if (amount >= 5000) {
            discount = 0.20;
        }
        else if (amount >= 3000) 
            {discount = 0.10;   
        } 

        if (premium.equalsIgnoreCase("Yes")) {
            discount += 0.05;
        }

        double finalAmount = amount - (amount * discount);
        System.out.println("Final Amount = " + finalAmount);
    }
}
