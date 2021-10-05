package HomeTraining.inputOutput.copy_file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreams {
    public static void main(String args[]) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream(System.getProperty("user.dir") +
                    "/src/HomeTraining/inputOutput/copy_file/input.txt");
            out = new FileOutputStream(System.getProperty("user.dir") +
                    "/src/HomeTraining/inputOutput/copy_file/output.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
