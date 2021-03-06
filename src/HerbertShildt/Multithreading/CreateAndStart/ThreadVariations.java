package HerbertShildt.Multithreading.CreateAndStart;

public class ThreadVariations {
    public static void main(String[] args) {
        System.out.println("Запуск основного потока.");

        // Создание и запуск потока
        MyThread mt = MyThread.createAndStart("Порожденный поток №1");

        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try  {
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
.Порожденный поток №1 - запуск
...B Порожденный поток №1, счетчик: 0
....B Порожденный поток №1, счетчик: 1
....B Порожденный поток №1, счетчик: 2
....B Порожденный поток №1, счетчик: 3
...B Порожденный поток №1, счетчик: 4
....B Порожденный поток №1, счетчик: 5
....B Порожденный поток №1, счетчик: 6
...B Порожденный поток №1, счетчик: 7
....B Порожденный поток №1, счетчик: 8
....B Порожденный поток №1, счетчик: 9
Порожденный поток №1 - завершение.
............Завершение основного потока.

 */
