public class Elevator {
    public static void main(String[] args) {

        int current = 5;
        int up = 7;
        int down = 3;

        if (up > current) {
            System.out.println("Next Stop = " + up);
        } else {
            System.out.println("Next Stop = " + down);
        }
    }
}