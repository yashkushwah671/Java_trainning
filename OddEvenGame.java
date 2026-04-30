import java.util.*;

public class OddEvenGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int even = 0, odd = 0;
        int num;

        while (true) {
            num = sc.nextInt();
            if (num == 0) break;

            if (num % 2 == 0) even++;
            else odd++;
        }

        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
    }
}