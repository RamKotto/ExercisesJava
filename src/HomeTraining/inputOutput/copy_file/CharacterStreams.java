package HomeTraining.inputOutput.copy_file;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreams {

    public static void main(String args[]) throws IOException {
        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader(System.getProperty("user.dir") +
                    "/src/HomeTraining/inputOutput/copy_file/input.txt");
            out = new FileWriter(System.getProperty("user.dir") +
                    "/src/HomeTraining/inputOutput/copy_file/output.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        }finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
