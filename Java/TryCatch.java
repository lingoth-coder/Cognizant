import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try 
        {
            System.out.print("Enter the first integer: ");
            int a = sc.nextInt();

            System.out.print("Enter the second integer: ");
            int b = sc.nextInt();

            int result = a/b;
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Error: Cannot divide by zero.");
        }
    }
}
