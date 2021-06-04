package GeekBrains.Multithreading.LectureThree.SimpleCDL;

import java.util.concurrent.CountDownLatch;

public class SimpleCDL {
    public static void main(String[] args) throws InterruptedException {
        // Задаем количество потоков
        final int THREADS_COUNT = 6;
        // Задаем значение счетчика
        final CountDownLatch cdl = new CountDownLatch(THREADS_COUNT);
        System.out.println("Начинаем");
        for (int i = 0; i < THREADS_COUNT; i++) {
            final int w = i;
            new Thread(() -> {
                try {
                    // считаем, что выполнение задачи занимает примерно 1 секунду
                    Thread.sleep(500 + (int)(500 * Math.random()));
                    System.out.println("Поток № " + w + " - готов");
                    // как только задача выполнена, уменьшаем счетчик
//                    System.out.println(cdl.toString());
                    cdl.countDown();
//                    System.out.println(cdl.toString());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
        // пока счетчик не приравнивается нулю, будем стоять на этой строке
        System.out.println("Будем ли тут ждать?");
        cdl.await();
        // как только все потоки выполнили свою работу - пишем сообщение
        System.out.println("Работа завершена");
    }
}
