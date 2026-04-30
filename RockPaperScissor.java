import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int userScore = 0, compScore = 0;

        String[] choices = {"rock", "paper", "scissor"};

        for (int i = 1; i <= 4; i++) {
            System.out.println("\nRound " + i);
            System.out.print("Enter rock, paper or scissor: ");
            String user = sc.next().toLowerCase();

            String comp = choices[rand.nextInt(3)];
            System.out.println("Computer chose: " + comp);

            if (user.equals(comp)) {
                System.out.println("Draw!");
            } 
            else if (
                (user.equals("rock") && comp.equals("scissor")) ||
                (user.equals("paper") && comp.equals("rock")) ||
                (user.equals("scissor") && comp.equals("paper"))
            ) {
                System.out.println("You win this round!");
                userScore++;
            } 
            else {
                System.out.println("Computer wins this round!");
                compScore++;
            }
        }

        // Final result
        System.out.println("\nFinal Score:");
        System.out.println("You: " + userScore);
        System.out.println("Computer: " + compScore);

        if (userScore > compScore) {
            System.out.println("🎉 You are the winner!");
        } else if (compScore > userScore) {
            System.out.println("💻 Computer wins!");
        } else {
            System.out.println("It's a draw!");
        }

        sc.close();
    }
}