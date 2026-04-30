import java.util.*;

public class cabfare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int distance = sc.nextInt();
        String night = sc.next();

        double fare = 0;

        if (distance <= 5) {
            fare = distance * 50;
        } 
        else if (distance <= 10) {
            fare = 5 * 50 + (distance - 5) * 40;
        } 
        else {
            fare = 5 * 50 + 5 * 40 + (distance - 10) * 30;
        }

        if (night.equalsIgnoreCase("Yes")) {
            fare *= 1.2;
        }

        System.out.println("Fare = " + fare);
    }
}