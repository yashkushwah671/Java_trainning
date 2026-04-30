import java.util.*;

class Demo {
    static int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter  the the number to calculate square ");
        int num = sc.nextInt();
        int ans = square(num);

        System.out.println("Square = " + ans);
    }
}