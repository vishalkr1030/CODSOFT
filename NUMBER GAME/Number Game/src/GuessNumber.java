import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        int maxAttempts = 10;
        int attempts = 0;
        int randomNumber = new Random().nextInt(100) + 1;;
        int score = 10;
        Scanner scanner = new Scanner(System.in);

        while (attempts < maxAttempts) {            

            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number.");
                
                break;
            } else {
                attempts++;
                score--;
                if (guess > randomNumber) {
                    System.out.println("Your guess is too high.");
                } else {
                    System.out.println("Your guess is too low.");
                }
            }
        }

        if (attempts == maxAttempts) {
            System.out.println("You lost! The correct number was " + randomNumber);
        } else {
            System.out.println("You won! You took " + attempts + " attempts.");
            System.out.println("Your score is " + score);
        }
        scanner.close();
      }
}
