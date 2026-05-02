import java.util.Scanner;

interface Payment {
    void pay(double amount);
}

class PaymentService implements Payment {

    public void pay(double amount) {
        System.out.println("Select a payment method...");
    }

    void payUPI(double amount) {
        System.out.println("Payment of " + amount + " done using UPI");
    }

    void payCredit(double amount) {
        System.out.println("Payment of " + amount + " done using Credit Card");
    }

    void payDebit(double amount) {
        System.out.println("Payment of " + amount + " done using Debit Card");
    }
}

public class Paymentinterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PaymentService ps = new PaymentService();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        System.out.println("1.UPI  2.Credit  3.Debit");
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> ps.payUPI(amount);
            case 2 -> ps.payCredit(amount);
            case 3 -> ps.payDebit(amount);
            default -> System.out.println("Invalid choice");
        }

        sc.close();
    }
}