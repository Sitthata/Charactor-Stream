import java.io.*;
import java.util.logging.Logger;

public class Lab2 {
    public static void main(String[] args) {
        // Write a file using BufferedWriter
        try {
            String data = "Hello World! \n Welcome to Java";
            BufferedWriter output = new BufferedWriter(new FileWriter("lab2.txt"));
            output.write(data);
            output.close();
        } catch (IOException ex) {
            Logger.getLogger(Lab2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        // Read a file using BufferedReader
        try {
            char[] buffer = new char[100];
            BufferedReader input = new BufferedReader(new FileReader("lab2.txt"));
            input.read(buffer);
            System.out.println(buffer);
            input.close();
        } catch (IOException ex) {
            Logger.getLogger(Lab2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}
