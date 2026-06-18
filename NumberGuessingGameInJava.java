import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class NumberGuessingGameInJava {
    static void numberGuessingGame() {
        Scanner sc = new Scanner(System.in);

        int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);

        int attempts = 5;

        System.out.println("\n=== Number Guessing Game ===");
        System.out.println("You have " + attempts + " attempts");
        System.out.println("Guess a number between 1 and 100");

        for (int i = 0; i < attempts; i++) {
            System.out.println("Attempts left: " + (attempts - i));
            System.out.print("Enter your guess ");

            checkInt(sc);
            int guessNumber = sc.nextInt();

            if (guessNumber == randomNumber) {
                System.out.println("🎉 Congratulations! You have guessed  corectly");
                
                sc.close();
                return;
            }

            else if (guessNumber < randomNumber) {
                System.out.println("Number is greater than " + guessNumber);
            }

            else {
                System.out.println("Number is less than " + guessNumber);
            }
        }

        System.out.println("\nGame Over!");
        System.out.println("The correct number was: " + randomNumber);

        sc.close();
    }

    public static void checkInt(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("ERR: This is not a valid number. Please try again");
            scanner.next();
        }
    }

    public static void main(String[] args) {
        numberGuessingGame();
    }
}