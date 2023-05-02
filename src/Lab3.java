import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab3 {
    public static void main(String[] args) {
        // Using PrintWriter
        try {
            PrintWriter output = new PrintWriter(new OutputStreamWriter(
                            new FileOutputStream("lab3.txt")
            ));
            output.println("Hello World!");
            output.println("Welcome to Java");
            output.println("Test1");
            output.println(19);
            output.println(50.5);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lab3.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Read a file using Scanner
        try {
            Scanner sc = new Scanner(new File("./lab3.txt"));
            while(sc.hasNext())
                System.out.println(sc.nextLine());
            sc.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lab3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
