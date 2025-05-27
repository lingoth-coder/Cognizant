import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaSort {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ashwin");
        names.add("Alwin");
        names.add("Jay");
        names.add("Emma");
        names.add("Brian");

        Collections.sort(names, (a, b) -> a.compareTo(b));

        System.out.println("Sorted List:");
        for (String name : names) 
        {
            System.out.println(name);
        }
    }
}
