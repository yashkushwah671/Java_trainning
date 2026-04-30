import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctPassword = "admin"; 
        int attempts = 3;
        boolean success = false;

        for (int i = 1; i <= attempts; i++) {
            String input = sc.next();

            if (input.equals(correctPassword)) {
                System.out.println("Login Successful");
                success = true;
                break;
            }
        }

        if (!success) {
            System.out.println("Account Locked");
        }

        sc.close();
    }
}