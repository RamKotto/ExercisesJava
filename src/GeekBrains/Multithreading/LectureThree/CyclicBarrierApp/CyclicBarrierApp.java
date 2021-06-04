package GeekBrains.Multithreading.LectureThree.CyclicBarrierApp;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierApp {
    public static void main(String[] args) {
        final int THREADS_COUNT = 5;
        CyclicBarrier cyclicBarrier = new CyclicBarrier(THREADS_COUNT);
        for (int i = 0; i < THREADS_COUNT; i++) {
            int index = i;
            new Thread(() -> {
                try {
                    System.out.println("Подготваливается " + index);
                    Thread.sleep(2000 + 500 * (int)(Math.random() * 10));
                    System.out.println("Готов " + index);
                    cyclicBarrier.await();
                    System.out.println("Поехал " + index);
                    Thread.sleep(2000 + 500 * (int)(Math.random() * 10));
                    System.out.println("Доехал " + index);
                    cyclicBarrier.await();
                    System.out.println("Гонка закончилась!!!");
                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
