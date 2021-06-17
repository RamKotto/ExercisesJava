package HomeTraining.Multithreading.CountDownLatch.CDLOne;

import java.util.concurrent.CountDownLatch;

public class CDLDemo {
    public static void main(String[] args) {
        CountDownLatch cdl = new CountDownLatch(5);

        System.out.println("Запуск основного потока.");

        new MyThread(cdl);
        try {
            cdl.await();
        } catch (InterruptedException exc) {
            exc.printStackTrace();
        }

        System.out.println("Завершение основного потока.");
    }
}

/*
Запуск основного потока.
0
1
2
3
4
Завершение основного потока.
 */
