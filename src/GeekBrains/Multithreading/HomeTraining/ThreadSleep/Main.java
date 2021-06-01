package GeekBrains.Multithreading.HomeTraining.ThreadSleep;

public class Main {

    public static void main(String[] args) {
        Thread th1 = new MyThreadSleep();
        Thread th2 = new MyThreadSleep();

        th1.start();
        th2.start();
    }
}
