package GeekBrains.Multithreading.LectureOne.Two;

public class Main {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new TestRunnable("thread1"));
        Thread thread2 = new Thread(new TestRunnable("thread2"));

        thread1.start();
        thread2.start();
    }
}
