import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int maxAttempts = 5;
        int score = 0;
        boolean playAgain = true;

        // TERMINAL NUMBER GUESSING ENGINE

        while (playAgain) {
            int target = random.nextInt(100) + 1;
            int attempts = 0;
            boolean won = false;
            System.out.println("\n[SYSTEM] Integer generated between 1 and 100.");

            while (attempts < maxAttempts) {
                System.out.printf("Attempt %d/%d. Enter guess: ", (attempts + 1), maxAttempts);
                try {
                    int guess = Integer.parseInt(scanner.nextLine().trim());
                    attempts++;

                    if (guess == target) {
                        System.out.printf("[MATCH] Target %d found! \n", target);
                        score += (maxAttempts - attempts + 1) * 10;
                        won = true;
                        break;
                    } else if (guess < target) {
                        System.out.println("-> LOW");
                    } else {
                        System.out.println("-> HIGH");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("[ERROR] 32-bit Integers only.");
                }
            }
            if (!won)
                System.out.println("[DEFEAT] Target was: " + target);
            System.out.println("Total Score: " + score);
            System.out.print("Play again? (y/n): ");
            playAgain = scanner.nextLine().trim().equalsIgnoreCase("y");
        }
    }
}
