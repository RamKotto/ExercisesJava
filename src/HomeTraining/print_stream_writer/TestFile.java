package HomeTraining.print_stream_writer;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class TestFile {
    static String stringForWrite = "Hello from Saint-P!";

    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("C://text.txt");
        PrintStream ps = new PrintStream(fos)) {
            ps.println(stringForWrite);
            System.out.println("writing complete");
        } catch (Exception ex) {
            System.out.println("Something went wrong");
        }
    }
}
