package HerbertShildt.Multithreading.SeveralThreads;

public class MoreThreads {
    public static void main(String[] args) {
        MyThread mt1 = MyThread.createAndStart("Порожденный поток №1");
        MyThread mt2 = MyThread.createAndStart("Порожденный поток №2");
        MyThread mt3 = MyThread.createAndStart("Порожденный поток №3");

        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            }catch (InterruptedException exc) {
                System.out.println("Прерывание основного потока.");
            }
        }
        System.out.println("Завершение основного потока.");
    }
}

/*
Вывод:
.Порожденный поток №1 запуск.
Порожденный поток №2 запуск.
Порожденный поток №3 запуск.
...В Порожденный поток №3, счетчик: 0
В Порожденный поток №1, счетчик: 0
В Порожденный поток №2, счетчик: 0
....В Порожденный поток №3, счетчик: 1
В Порожденный поток №1, счетчик: 1
В Порожденный поток №2, счетчик: 1
....В Порожденный поток №3, счетчик: 2
В Порожденный поток №1, счетчик: 2
В Порожденный поток №2, счетчик: 2
...В Порожденный поток №1, счетчик: 3
В Порожденный поток №3, счетчик: 3
В Порожденный поток №2, счетчик: 3
....В Порожденный поток №3, счетчик: 4
В Порожденный поток №1, счетчик: 4
В Порожденный поток №2, счетчик: 4
....В Порожденный поток №2, счетчик: 5
В Порожденный поток №3, счетчик: 5
В Порожденный поток №1, счетчик: 5
...В Порожденный поток №1, счетчик: 6
В Порожденный поток №3, счетчик: 6
В Порожденный поток №2, счетчик: 6
....В Порожденный поток №2, счетчик: 7
В Порожденный поток №1, счетчик: 7
В Порожденный поток №3, счетчик: 7
....В Порожденный поток №2, счетчик: 8
В Порожденный поток №3, счетчик: 8
В Порожденный поток №1, счетчик: 8
....В Порожденный поток №2, счетчик: 9
Порожденный поток №2 завершение.
В Порожденный поток №1, счетчик: 9
В Порожденный поток №3, счетчик: 9
Порожденный поток №3 завершение.
Порожденный поток №1 завершение.
............Завершение основного потока.
 */
