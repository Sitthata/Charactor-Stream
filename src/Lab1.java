import java.io.*;
import java.util.logging.Logger;

public class Lab1 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // Write to a file
        try {
            String data = "Hello World! \n Welcome to Java";
            OutputStreamWriter output = new OutputStreamWriter(new FileOutputStream("lab1.txt"));
            output.write(data);
            output.close();
        } catch (IOException ex) {
            Logger.getLogger(Lab1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        // Read a file
        try {
            InputStreamReader input = new InputStreamReader(new FileInputStream("lab1.txt"));
            int character;
            while ((character = input.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException ex) {
            Logger.getLogger(Lab1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}
