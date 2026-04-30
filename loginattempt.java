import java.util.Scanner;

public class loginattempt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        for (int i = 1; i <= 3; i++) {
            String attempt = sc.next(); 

            if (attempt.equals("correct")) {
                System.out.println("Login Successful");
                return;
            } 
        }

        System.out.println("Account Locked");
    }
}