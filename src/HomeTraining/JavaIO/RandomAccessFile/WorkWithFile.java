package HomeTraining.JavaIO.RandomAccessFile;

import java.io.IOException;
import java.io.RandomAccessFile;


public class WorkWithFile {

    private String path;

    // Экземпляр класса, который предоставит возможность работать с файлом
    private RandomAccessFile file;

    // Говорим конструктору проинициализировать путь к файлу
    public WorkWithFile (String path) {
        this.path = path;
    }

    // Метод демонстрирует переход на указанный символ
    public long goTo(int num) throws IOException {
        // инициализируем класс RandomAccessFile
        // в параметры передаем путь к файлу
        // и модификатор который говорит, что файл откроется только для чтения
        file = new RandomAccessFile(path, "r");

        //  переходим на num символ
        file.seek(num);

        // получаем текущее значение курсора в файле
        long pointer = file.getFilePointer();
        file.close();

        return pointer;
    }

    // Метод читает файл и выводит его содержимое
    public String read() throws IOException {
        file = new RandomAccessFile(path, "r");
        String res = "";
        int b = file.read();
        // побитово читаем символы, и плюсуем их в строку
        while (b != -1) {
            res = res + (char)b;
            b = file.read();
        }
        file.close();
        return res;
    }

    // Читаем файл с определенного символа
    public String readFrom(int numberSymbol) throws IOException {
        // открываем файл для чтения
        file = new RandomAccessFile(path, "r");
        String res = "";

        // ставим указатель на нужный нам символ
        file.seek(numberSymbol);
        int b = file.read();

        // побитово читаем файл, и добавляем символы в строку
        while (b != -1) {
            res = res + (char)b;
            b = file.read();
        }
        file.close();

        return res;
    }

    // Запись в файл
    public void write(String st) throws IOException {
        // открываем файл для записи
        // для этого указываем модификатор rw (read write)
        file = new RandomAccessFile(path, "rw");

        // записываем строку переведенную в биты
        file.write(st.getBytes());

        // закрываем файл, после чего записываемые данные попадут в файл
        file.close();
    }
}
