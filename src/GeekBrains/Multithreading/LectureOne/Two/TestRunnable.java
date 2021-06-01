package GeekBrains.Multithreading.LectureOne.Two;

public class TestRunnable implements Runnable{
    String nameOfThread;

    public TestRunnable(String name) {
        this.nameOfThread = name;
    }

    @Override
    public  void run() {
        for (int i = 20; i > 0; i--) {
            System.out.println(nameOfThread + ": " + i);
        }
    }
}
