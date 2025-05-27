import java.util.Random;
import java.util.Scanner;

public class NumberGuess{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int guess;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I am thinking of a number between 1 and 100.");

        while (true) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess < secretNumber) 
            {
                System.out.println("Too low! Try again.");
            } 
            else if (guess > secretNumber) 
            {
                System.out.println("Too high! Try again.");
            } 
            else
            {
                System.out.println("Congratulations! You guessed the number correctly.");
                break; 
            }
        }
    }
}
