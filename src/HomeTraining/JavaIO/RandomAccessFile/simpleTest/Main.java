package HomeTraining.JavaIO.RandomAccessFile.simpleTest;

import java.io.IOException;
import java.io.RandomAccessFile;


public class Main {
    public static void main(String[] args) throws IOException{
        RandomAccessFile raf = new RandomAccessFile("simpleTest.txt", "rw");
        String firstString = "Hello World! \n";
        raf.write(firstString.getBytes());
        raf.close();

        raf = new RandomAccessFile("simpleTest.txt", "rw");
        System.out.println(raf.read()); // вывод 72 (это байты)
        System.out.println(raf.read()); // вывод 101 (это байты)
        raf.seek(0);  // возвращаем курсор на начальную позицию
        String res = "";
        int b = raf.read();  // здесь сейчас число 72
        // конец файла в байтовом обозначении равняется -1
        while (b != -1) {
            res += (char)b;
            b = raf.read();  // а сейчас здесь число 101. Каждый вызов read - сдвигает курсор.
        }
        System.out.println(res);

        /*
        Вывод:
        72
        101
        Hello World!
         */
    }
}
