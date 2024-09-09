import java.io.*;

//Example of FileNotFoundException and
//handling it using try and catch block
class extra6 {
    public static void main(String[] args) {
        try {
            // Creating an instance of FileReader class
            FileReader fileReader = new FileReader("input.txt");
            System.out.println(fileReader.read());
            fileReader.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
