package GeekBrains.Multithreading.HomeTraining.ThreadSleep;

public class MyThreadSleep extends Thread{

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName());
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
    }
}
