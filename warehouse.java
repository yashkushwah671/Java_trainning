import java.util.Scanner;

public class warehouse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of products: ");
        int n = sc.nextInt();

        int restockCount = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter quantity of product " + i + ": ");
            int qty = sc.nextInt();

            if (qty < 10) {
                restockCount++;
            }
        }

        System.out.println("\nTotal products to restock: " + restockCount);

        sc.close();
    }
}