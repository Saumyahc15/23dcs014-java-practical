import java.util.*;

public class p40 {
    public static void main(String[] args) {
        String text = "This is a test. This test is only a test.";
        text = text.toLowerCase().replaceAll("[^a-z ]", ""); // Clean up the text

        // Split the text into words
        String[] words = text.split("\\s+");

        // Use a TreeMap to store the words and their counts (automatically sorts by key)
        Map<String, Integer> wordCount = new TreeMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Display the words and their counts
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
