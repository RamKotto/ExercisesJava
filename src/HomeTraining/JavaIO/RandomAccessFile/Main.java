package HomeTraining.JavaIO.RandomAccessFile;

import java.io.IOException;

public class Main {

    // Создаем экземпляр класса, что мы создали
    private static WorkWithFile worker;

    public static void main(String[] args) throws IOException {
        // инициализируем класс, передавая в него путь к файлу
        // так как наш файл лежит в корне проекта, то мы просто указываем его имя
        worker = new WorkWithFile("testfile.txt");

        // пишем передаваемый текст в файл
        worker.write("Give me a break from your take and your take. \n" +
                "Come on and give me a break,\n" +
                "what do you want from me?\n" +
                "Feeding the rich with that son of a bitch.\n" +
                "Well that son of a bitch,\n" +
                "he looks just like me!\n" +
                "Yeah, yeah");

        // переходим на указанный символ в файле
        System.out.println(worker.goTo(100));
        System.out.println("**********");

        // читаем весь файл
        System.out.println(worker.read());
        System.out.println("**********");

        // читаем файл с указанного символа
        System.out.println(worker.readFrom(105));

    }
}

/*
Вывод:

100
**********
Give me a break from your take and your take.
Come on and give me a break,
what do you want from me?
Feeding the rich with that son of a bitch.
Well that son of a bitch,
he looks just like me!
Yeah, yeah
**********
ding the rich with that son of a bitch.
Well that son of a bitch,
he looks just like me!
Yeah, yeah

Process finished with exit code 0

 */
