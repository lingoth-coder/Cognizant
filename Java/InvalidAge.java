import java.util.InputMismatchException;
import java.util.Scanner;


class InvalidAgeException extends Exception {
    InvalidAgeException() {
        super("You must be 18 or older to proceed");
    }
}

public class InvalidAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            if (age < 18) {
                throw new InvalidAgeException();
            }

            System.out.println("You are eligible");
        } catch (InvalidAgeException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        }
    }
}
