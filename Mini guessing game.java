import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int numberToGuess = rand.nextInt(100) + 1; // random number between 1 and 100
        int attempts = 0;
        int guess = 0;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I’ve picked a number between 1 and 100. Can you guess it?");

        while (guess != numberToGuess) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Correct! You guessed it in " + attempts + " attempts.");
            }
        }

        sc.close();
    }
}
