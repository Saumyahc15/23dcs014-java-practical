//Character Stream Example
import java.io.*;

public class p31 {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("input.txt");
             FileWriter writer = new FileWriter("output.txt")) {
             
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
            System.out.println("Character stream copy completed.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

/*
//Byte Stream Example:
import java.io.*;
public class ByteStreamExample {
    public static void main(String[] args) {
        try (FileInputStream inStream = new FileInputStream("input.bin");
             FileOutputStream outStream = new FileOutputStream("output.bin")) {

            int byteData;
            while ((byteData = inStream.read()) != -1) {
                outStream.write(byteData);
            }
            System.out.println("Byte stream copy completed.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

//BufferedReader/BufferedWriter for console input/output:
import java.io.*;
public class BufferedReadWrite {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new FileWriter("console_output.txt"))) {

            System.out.println("Enter text (type 'exit' to quit):");
            String input;
            while (!(input = reader.readLine()).equals("exit")) {
                writer.write(input);
                writer.newLine();
            }
            System.out.println("Console input saved to file.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}*/
