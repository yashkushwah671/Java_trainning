public class diamond {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <= 2 * n - 1; i++) {

            if (i <= n) {
                // Upper part

                // Spaces
                for (int k = 1; k <= n - i; k++) {
                    System.out.print(" ");
                }

                // Stars
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }

            } else {
                // Lower part

                // Spaces
                for (int k = 1; k <= i - n; k++) {
                    System.out.print(" ");
                }

                // Stars
                for (int j = 1; j <= 2 * (2 * n - i) - 1; j++) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}