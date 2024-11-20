import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("Enter your choice (rock/paper/scissors) or 'quit' to exit:");
            String userChoice = scanner.nextLine().toLowerCase();

            // Check if user wants to quit
            if (userChoice.equals("quit")) {
                System.out.println("Thanks for playing!");
                break;
            }

            // Validate user input
            if (!(userChoice.equals("rock") || userChoice.equals("paper") || userChoice.equals("scissors"))) {
                System.out.println("Invalid choice. Please enter 'rock', 'paper', or 'scissors'.");
                continue;
            }

            // Generate computer's choice
            String[] choices = {"rock", "paper", "scissors"};
            String computerChoice = choices[random.nextInt(3)];

            System.out.println("Computer chose: " + computerChoice);

            // Determine the winner
            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                       (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                       (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        }

        scanner.close(); // Close the scanner to avoid resource leak
    }
}
