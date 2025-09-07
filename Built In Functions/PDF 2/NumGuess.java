import java.util.Scanner;
import java.util.Random;

public class NumGuess {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int low = 1;
        int high = 100;
        boolean guessedCorrectly = false;

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it. Respond with 'low', 'high', or 'correct'.");

        while (!guessedCorrectly && low <= high) {
            int guess = generateGuess(low, high);
            System.out.println("Is it " + guess + "?");
            String feedback = getUserFeedback(scanner);

            if (feedback.equals("correct")) {
                System.out.println("Yay! I guessed your number.");
                guessedCorrectly = true;
            } else {
                int[] newRange = updateRange(feedback, low, high, guess);
                low = newRange[0];
                high = newRange[1];
            }
        }

        if (!guessedCorrectly) {
            System.out.println("Hmm, are you sure you gave correct feedback?");
        }
    }

    public static int generateGuess(int low, int high) {
        return low + (high - low) / 2;
    }

    public static String getUserFeedback(Scanner scanner) {
        String feedback;
        while (true) {
            System.out.print("Your feedback (low/high/correct): ");
            feedback = scanner.nextLine().trim().toLowerCase();
            if (feedback.equals("low") || feedback.equals("high") || feedback.equals("correct")) {
                break;
            } else {
                System.out.println("Invalid input. Please enter 'low', 'high', or 'correct'.");
            }
        }
        return feedback;
    }

    public static int[] updateRange(String feedback, int low, int high, int guess) {
        if (feedback.equals("low")) {
            return new int[]{guess + 1, high};
        } else if (feedback.equals("high")) {
            return new int[]{low, guess - 1};
        }
        return new int[]{low, high}; // unchanged if correct
    }
}
