import java.util.*;

class DuplicateElementException extends Exception {
    DuplicateElementException(String message) {
        super(message);
    }
}

public class sup1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter a list of integers (enter 'quit' to finish):");

        while (true) {
            String input = scanner.next();
            if (input.equalsIgnoreCase("quit")) {
                break;
            }
            int number = Integer.parseInt(input);
            try {
                addNumber(numbers, number);
            } catch (DuplicateElementException e) {
                System.out.println(e.getMessage());
                System.out.println("Please enter a unique number:");
                continue;
            }
        }

        System.out.println("You entered: " + numbers);
    }

    public static void addNumber(List<Integer> numbers, int number) throws DuplicateElementException {
        if (numbers.contains(number)) {
            throw new DuplicateElementException("Duplicate element: " + number);
        }
        numbers.add(number);
    }
}
