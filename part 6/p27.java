import java.io.*;

public class p27 {
    public static void main(String[] args) {
        for (String fileName : args) {
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                int lines = 0;
                while (reader.readLine() != null) {
                    lines++;
                }
                System.out.println(fileName + ": " + lines + " lines");
            } catch (IOException e) {
                System.err.println("Error reading file " + fileName + ": " + e.getMessage());
            }
        }
    }
}
