import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    int attempts = 1;

    public void main() {
        Random random = new Random();
        int randomNumber = random.nextInt(101);

        makeAGuess(randomNumber);
        System.out.println("You guessed the number in " + attempts + " attemps.");
    }

    public void makeAGuess(int randomNumber) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Type your guess");
        int userGuess = userInput.nextInt();
        if (userGuess == randomNumber) {
            System.out.println("CORRECT!");
            return;
        } else if (userGuess < randomNumber) {
            System.out.println("Guess was too low");
            attempts++;
            makeAGuess(randomNumber);
        } else {
            System.out.println("Guess was too high");
            attempts++;
            makeAGuess(randomNumber);

        }
    }
}