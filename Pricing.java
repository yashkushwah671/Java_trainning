import java.util.*;

public class Pricing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double base = sc.nextDouble();
        String demand = sc.next();
        String weekend = sc.next();

        if (demand.equalsIgnoreCase("High")) {
            base *= 1.2;
        }
        if (weekend.equalsIgnoreCase("Yes")) {
            base *= 1.1;
        }

        System.out.println("Final Price = " + base);
    }
}