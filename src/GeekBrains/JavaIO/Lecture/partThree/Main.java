package GeekBrains.JavaIO.Lecture.partThree;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    // FileInputStream
    // FileOutputStream
    public static void main(String[] args) {
        byte[] outData = "Java".getBytes();
        try (FileOutputStream out = new FileOutputStream("demo.txt")) {
            out.write(outData);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
