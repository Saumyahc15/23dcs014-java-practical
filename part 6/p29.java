import java.io.*;
import java.util.Scanner;

public class p29 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java WordSearch <file> <word>");
            return;
        }

        String fileName = args[0];
        String targetWord = args[1];

        try (Scanner scanner = new Scanner(new File(fileName))) {
            int lineCount = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.contains(targetWord)) {
                    System.out.println("Word found on line " + (lineCount + 1) + ": " + line);
                }
                lineCount++;
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error: File " + fileName + " not found.");
        }
    }
}
/*
public class WrapperExample {
    public static void main(String[] args) {
        Integer i = Integer.valueOf("42");
        int intVal = i.intValue();
        System.out.println("Integer value: " + intVal);
    }
}*/
