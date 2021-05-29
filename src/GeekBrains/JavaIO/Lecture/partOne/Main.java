package GeekBrains.JavaIO.Lecture.partOne;

// java io
// Stream in/out, byte/character
// - file
// - console
// - network
// Stream != Thread != StreamAPI

// Input/Reader - чтение
// Output/Writer - запись
// Stream - работа с байтами
// (Reader, Writer) - с символами
// Buffered - добавление буферизации
// (Byte, Char) - указывает тип, с которым работаем
// Object - работаем с объектами. Сериализация / Десериализация.

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("Titanik.mp4");
        if (file.exists()) {
            System.out.println("File exists!");
        } else {
            file.createNewFile();
        }

//        BufferedInputStream in = new BufferedInputStream(new FileInputStream("demo.txt"));

//        // создаст все эти папки (path/to/the/directory) из корневого каталога
//        File path = new File("path/to/the/directory");
//        path.mkdirs();
    }
}
