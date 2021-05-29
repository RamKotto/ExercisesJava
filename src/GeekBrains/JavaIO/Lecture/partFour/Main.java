package GeekBrains.JavaIO.Lecture.partFour;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        byte[] outData = new byte[124];
        // ASCII Table 65 = A
        Arrays.fill(outData, (byte) 65);
        try (FileOutputStream out = new FileOutputStream("demo2.txt")) {
            for (byte outDatum : outData) {
                out.write(outDatum);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
