package HerbertShildt.Multithreading.ExtendThread;

public class ExtendThread {
    public static void main(String[] args) {
        System.out.println("Запуск основного потока.");

//        MyThread mt = new MyThread("Порожденный поток №1");
//        mt.start();

        MyThread.createAndStart("Порожденный поток №2");

        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("Прерывание основного потока.");
            }
        }
        System.out.println("Завершение основного потока.");
    }
}

/*
Вывод:
Запуск основного потока.
.Порожденный поток №2 - запуск.
...В Порожденный поток №2, счетчик: 0
....В Порожденный поток №2, счетчик: 1
....В Порожденный поток №2, счетчик: 2
...В Порожденный поток №2, счетчик: 3
....В Порожденный поток №2, счетчик: 4
....В Порожденный поток №2, счетчик: 5
....В Порожденный поток №2, счетчик: 6
...В Порожденный поток №2, счетчик: 7
....В Порожденный поток №2, счетчик: 8
....В Порожденный поток №2, счетчик: 9
Порожденный поток №2 - завершение.
............Завершение основного потока.
 */
