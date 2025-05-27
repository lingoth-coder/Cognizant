import java.util.Scanner;

public class Calculator {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        boolean calculation = true;
        while(calculation)
        {
            System.out.print("Enter the first number: ");
            double a = sc.nextDouble();
            System.out.print("Enter the second number: ");
            double b = sc.nextDouble();
            System.out.println("Choose an operation from (1 to 5)");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int c = sc.nextInt();
            double result;
            switch(c)
            {
                case 1:
                    result = a+b;
                    System.out.println("The result is: " + result);
                    break;
                
                case 2:
                    result = a-b;
                    System.out.println("The result is: " + result);
                    break;

                case 3:
                    result = a*b;
                    System.out.println("The result is: " + result);
                    break;

                case 4:
                    if(b!=0)
                    {
                        result = a/b;
                        System.out.println("The result is: " + result);
                    }
                    else
                    {
                        System.out.println("Division by zero is not allowed");
                    }
                    break;

                case 5:
                    calculation=false;
                    System.out.println("Exiting the calculator :) ");
                    break;
                default:
                    System.out.println("Enter your choice from (1 to 5)");
            }
            System.out.println();
        }
    }
}
