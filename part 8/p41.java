import java.io.*;
import java.util.*;

public class p40 {

    public static void main(String[] args) throws IOException {
        // List of Java keywords
        HashSet<String> keywords = new HashSet<>(Arrays.asList(
                "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", 
                "const", "continue", "default", "do", "double", "else", "enum", "extends", "final", 
                "finally", "float", "for", "goto", "if", "implements", "import", "instanceof", "int", 
                "interface", "long", "native", "new", "package", "private", "protected", "public", 
                "return", "short", "static", "strictfp", "super", "switch", "synchronized", "this", 
                "throw", "throws", "transient", "try", "void", "volatile", "while"));

        // Open the Java source file
        BufferedReader reader = new BufferedReader(new FileReader("MyJavaFile.java"));
        String line;
        int keywordCount = 0;

        // Read the file line by line
        while ((line = reader.readLine()) != null) {
            // Tokenize the line
            String[] words = line.split("\\W+");
            for (String word : words) {
                if (keywords.contains(word)) {
                    keywordCount++;
                }
            }
        }

        reader.close();
        System.out.println("Number of keywords found: " + keywordCount);
    }
}
