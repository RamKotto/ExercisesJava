package GeekBrains.JavaIO.Lecture.partFive;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // буфер в виде 10 символов
        byte[] buff = new byte[10];

        try (FileInputStream in = new FileInputStream("demo2.txt")) {
            int count;
            while ((count = in.read(buff)) > 0) {
                for (int i = 0; i < count; i++) {
                    System.out.print(count);
                    System.out.print((char) buff[i]);
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
