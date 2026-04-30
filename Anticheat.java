import java.util.*;

public class Anticheat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tabSwitch = sc.nextInt();
        int idle = sc.nextInt();

        if (tabSwitch > 3 || idle > 5) {
            System.out.println("Cheating Suspected");
        } else {
            System.out.println("Normal");
        }
    }
}