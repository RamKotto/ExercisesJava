package GeekBrains.JavaIO.Lecture.partSix;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (FileInputStream in = new FileInputStream("demo.txt")) {
            int x;
            // каждый вызов in.read() переводит нас на следующий символ
            // поэтому мы используем int x; а не ((char) in.read);
            // Reads a byte of data from this input stream. This method blocks if no input is yet available.
            // Returns:
            // the next byte of data, or -1 if the end of the file is reached.
            // Throws:
            // IOException – if an I/O error occurs.
            while ((x = in.read()) > -1) {
                System.out.println((char) x);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
