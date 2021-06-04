package GeekBrains.Multithreading.LectureThree.SemaphoreOne;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {
    public static void main(String[] args) {
        Semaphore smp = new Semaphore(2);
        for (int i = 0; i < 5; i++) {
            final int w = i + 1;
            new Thread(() -> {
                try {
                    System.out.println("Поток " + w + " перед семофором!");
                    smp.acquire();
                    System.out.println("Поток " + w + " получил доступ к ресурсу.");
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    System.out.println("Поток " + w + " освободил ресурс!");
                    smp.release();
                }
            }).start();
        }
    }
}
