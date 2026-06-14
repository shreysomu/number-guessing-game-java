import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class NumberGuessingGameInJava {

    static void numberGuessingGame() {

        Scanner sc = new Scanner(System.in);

        int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);

        int attempts = 5;

        System.out.println("=== Number Guessing Game ===");
        System.out.println("You have " + attempts + " attempts.");
        System.out.println("Guess a number between 1 and 100.");

        for (int i = 0; i < attempts; i++) {

            System.out.println("\nAttempts left: " + (attempts - i));
            System.out.print("Enter your guess: ");

            int guessedNumber = sc.nextInt();

            if (guessedNumber == randomNumber) {
                System.out.println("🎉 Congratulations! You guessed correctly.");
                sc.close();
                return;
            } else if (guessedNumber < randomNumber) {
                System.out.println("Number is greater than " + guessedNumber);
            } else {
                System.out.println("Number is less than " + guessedNumber);
            }
        }

        System.out.println("\nGame Over!");
        System.out.println("The correct number was: " + randomNumber);

        sc.close();
    }

    public static void main(String[] args) {
        numberGuessingGame();
    }
}