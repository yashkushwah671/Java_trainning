import java.util.*;

public class Result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
            if (marks[i] < 33) {
                System.out.println("Fail");
                return;
            }
            sum += marks[i];
        }

        double avg = sum / 5.0;

        if (avg>= 75) System.out.println("Distinction");
        else if (avg >= 60) System.out.println("First Class");
        else if (avg >= 50) System.out.println("Second Class");
        else System.out.println("Pass");
    }
}