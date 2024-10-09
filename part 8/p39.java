import java.util.Arrays;

public class p39 {

    // Generic method to sort an array of Comparable objects
    public static <T extends Comparable<T>> void sortArray(T[] array) {
        Arrays.sort(array);
    }

    public static void main(String[] args) {
        // Example with Integer array
        Integer[] intArray = {3, 1, 4, 2};
        sortArray(intArray);
        System.out.println("Sorted Integer array: " + Arrays.toString(intArray));

        // Example with String array
        String[] strArray = {"banana", "apple", "cherry", "date"};
        sortArray(strArray);
        System.out.println("Sorted String array: " + Arrays.toString(strArray));
    }
}
