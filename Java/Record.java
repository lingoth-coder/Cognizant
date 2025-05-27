import java.util.List;
import java.util.stream.Collectors;

record Person(String name, int age) {}

public class Record {
    public static void main(String[] args) {
       
        List<Person> people = List.of(
            new Person("Alice", 25),
            new Person("Bob", 17),
            new Person("Charlie", 30),
            new Person("Daisy", 16)
        );

       
        System.out.println("All People:");
        people.forEach(System.out::println);

        List<Person> adults = people.stream().filter(person -> person.age() >= 18).collect(Collectors.toList());

        System.out.println("\nAdults 18+: ");
        adults.forEach(System.out::println);
    }
}
