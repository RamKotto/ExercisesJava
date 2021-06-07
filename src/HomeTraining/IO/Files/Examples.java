package HomeTraining.IO.Files;

import java.io.*;

public class Examples {

    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            // создаем файл, если его не существует
            // [pathname:"newFile.txt"]  (относительно корневого каталога программы)
            File file = new File("newFile.txt");
            if (!file.exists()) {
                file.createNewFile();
            }

            //  Будет постоянно перезаписывать текст в файле!
            PrintWriter pw = new PrintWriter(file);
            pw.println("Hello World!");
            pw.println("For the Horde!!!");
            pw.close();

            // Чтобы добавить текст в файл
            String filename = "newFile.txt";
            FileWriter fw = new FileWriter(filename, true);    // флаг true позволяет добавлять текст в файл
            fw.write("добавляем новую строку в файл");
            fw.close();

            // Читаем из файла
            br = new BufferedReader(new FileReader("newFile.txt"));
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("Error: " + e);
            }
        }
    }
}
