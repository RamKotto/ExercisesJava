package GeekBrains.JavaIO.Lecture.partTwo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Input and Output Streams
        byte[] arr = {65, 66, 67};
//        byte[] arr = {0, 127, -1};
        ByteArrayInputStream in = new ByteArrayInputStream(arr);
        int x;
        while ((x = in.read()) != -1) {
            System.out.print(x + " ");
        }
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write(10);
        out.write(11);
        byte[] arr2 = out.toByteArray();
        System.out.println(Arrays.toString(arr2));
    }
}
