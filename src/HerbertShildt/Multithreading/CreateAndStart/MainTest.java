package HerbertShildt.Multithreading.CreateAndStart;

public class MainTest {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("HelloWorld!");
        t1.thrd.start();
    }
}

/*
Вывод:
HelloWorld! - запуск
B HelloWorld!, счетчик: 0
B HelloWorld!, счетчик: 1
B HelloWorld!, счетчик: 2
B HelloWorld!, счетчик: 3
B HelloWorld!, счетчик: 4
B HelloWorld!, счетчик: 5
B HelloWorld!, счетчик: 6
B HelloWorld!, счетчик: 7
B HelloWorld!, счетчик: 8
B HelloWorld!, счетчик: 9
HelloWorld! - завершение.
 */
