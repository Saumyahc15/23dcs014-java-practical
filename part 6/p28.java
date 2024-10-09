import java.io.*;

public class p28 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java CharacterCount <file> <char>");
            return;
        }

        String fileName = args[0];
        char targetChar = args[1].charAt(0);

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int charCount = 0;
            int c;
            while ((c = reader.read()) != -1) {
                if (c == targetChar) {
                    charCount++;
                }
            }
            System.out.println("Character '" + targetChar + "' appears " + charCount + " times in " + fileName);
        } catch (IOException e) {
            System.err.println("Error reading file " + fileName + ": " + e.getMessage());
        }
    }
}
