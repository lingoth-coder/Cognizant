import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> studentNames = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String name;
        String choice;

        System.out.println("-----Student Name List-----");

        do {
            System.out.print("Enter student name: ");
            name = sc.nextLine();
            studentNames.add(name);

            System.out.print("Do you want to add another name? (yes/no): ");
            choice = sc.nextLine().toLowerCase();
        } while (choice.equals("yes"));

        System.out.println("\nList of Students");
        for (String student : studentNames) {
            System.out.println(student);
        }
    }
}
