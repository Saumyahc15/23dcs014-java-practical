//Ascending order
import java.util.*;
import java.util.stream.Collectors;

public class sup {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("banana", "apple", "mango", "cherry");

        List<String> sortedStrings = strings.stream()
                                            .sorted()
                                            .collect(Collectors.toList());
        System.out.println("Ascending order: " + sortedStrings);
    }
}

//descending order
/*import java.util.*;
import java.util.stream.Collectors;

public class sup {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("banana", "apple", "mango", "cherry");

        List<String> sortedStrings = strings.stream()
                                            .sorted(Comparator.reverseOrder())
                                            .collect(Collectors.toList());
        System.out.println("Descending order: " + sortedStrings);
    }
}*/

