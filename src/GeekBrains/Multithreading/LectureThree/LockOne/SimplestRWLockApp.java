package GeekBrains.Multithreading.LectureThree.LockOne;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SimplestRWLockApp {
    public static void main(String[] args) {
        final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
        for (int i = 0; i < 3; i++) {
            int index = i;
            new Thread(() -> {
                try {
                    readWriteLock.readLock().lock();
                    System.out.println("Начало чтения " + index);
                    shirtSleep(500);
                    System.out.println("Завершение чтения " + index);
                } finally {
                    readWriteLock.readLock().unlock();
                }
            }).start();
        }
        for (int i = 0; i < 2; i++) {
            int index = i;
            new Thread(() -> {
                try {
                    readWriteLock.writeLock().lock();
                    System.out.println("Начало записи " + index);
                    shirtSleep(500);
                    System.out.println("Завершение запии " + index);
                } finally {
                    readWriteLock.writeLock().unlock();
                }
            }).start();
        }

    }

    public static void shirtSleep(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
