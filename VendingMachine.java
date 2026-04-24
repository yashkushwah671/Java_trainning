import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tray, item;
        int total = 0;
        char more;

        System.out.println("Select Tray:");
        System.out.println("1. Snacks");
        System.out.println("2. Drinks");
        tray = sc.nextInt();

        do {
            if (tray == 1) {
                System.out.println("\nSnacks Menu:");
                System.out.println("1. Chips (20)");
                System.out.println("2. Biscuits (15)");
                item = sc.nextInt();

                switch (item) {
                    case 1: total += 20; break;
                    case 2: total += 15; break;
                    default: System.out.println("Invalid item");
                }

            } else if (tray == 2) {
                System.out.println("\nDrinks Menu:");
                System.out.println("1. Coffee (10)");
                System.out.println("2. Tea (8)");
                item = sc.nextInt();

                switch (item) {
                    case 1: total += 10; break;
                    case 2: total += 8; break;
                    default: System.out.println("Invalid item");
                }

            } else {
                System.out.println("Invalid tray");
                break;
            }

            System.out.println("Current Total = " + total);

            System.out.print("More items? (y/n): ");
            more = sc.next().charAt(0);

        } while (more == 'y' || more == 'Y');

        System.out.println("Final Total = " + total);
    }
}