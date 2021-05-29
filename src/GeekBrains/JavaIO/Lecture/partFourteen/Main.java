package GeekBrains.JavaIO.Lecture.partFourteen;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (RandomAccessFile raf = new RandomAccessFile("demo.txt", "r")){
            raf.seek(2);
            System.out.println((char) raf.read());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
