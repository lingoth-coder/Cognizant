import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String choice;

        System.out.println("----Student ID to Name Mapping----");

        do {
            System.out.print("Enter student ID: ");
            int id = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            studentMap.put(id, name);

            System.out.print("Do you want to add another student? (yes/no): ");
            choice = sc.nextLine().toLowerCase();
        } while (choice.equals("yes"));

        System.out.print("\nEnter student ID to retrieve name: ");
        int searchId = sc.nextInt();

        if (studentMap.containsKey(searchId)) {
            System.out.println("Student Name: " + studentMap.get(searchId));
        } else {
            System.out.println("No student found with ID " + searchId);
        }
    }
}
