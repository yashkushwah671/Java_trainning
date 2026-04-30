public class Pattern4
 {
    public static void main(String[] args) {

        int n = 5;

        char ch = 'A';

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (j == 2 || (i == 1 && j >= 1 && j <= 3) || (i == 3 && j >= 1 && j <= 3)) {
                    System.out.print(ch + " ");
                    ch++;
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}