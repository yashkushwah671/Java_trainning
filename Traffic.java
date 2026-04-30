import java.util.Scanner;

public class Traffic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter speed:");
        int speed = sc.nextInt();

        System.out.println("Repeated violation (Yes/No):");
        String repeated = sc.next();

        int fine = 0;

        if (speed > 100) {
            fine = 1000;
        } 
        else if (speed > 80) {
            fine = 500;
        } 
        else {
            fine = 0;
        }

        if (repeated.equals("Yes")) {
            fine = fine * 2;
        }

        System.out.println("Fine = " + fine);
    }
}