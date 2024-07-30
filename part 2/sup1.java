public class sup1 {
    public static void main(String[] args) {
        String sampleString = "The quick brown fox jumps over the lazy dog.";
        String regex = "fox";
        String replacement = "cat";

        String newString = sampleString.replace(regex, replacement);

        System.out.println("Original string: " + sampleString);
        System.out.println("New string: " + newString);
    }
}
