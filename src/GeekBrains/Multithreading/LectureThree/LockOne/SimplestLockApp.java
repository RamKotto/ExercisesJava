package GeekBrains.Multithreading.LectureThree.LockOne;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SimplestLockApp {
    public static void main(String[] args) {
        final Lock lock = new ReentrantLock();
        new Thread(() -> {
            try {
                lock.lock();
                // критическая секция
            } finally {
                lock.unlock();
            }
        }).start();
    }
}
