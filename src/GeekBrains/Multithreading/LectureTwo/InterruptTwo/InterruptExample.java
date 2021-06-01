package GeekBrains.Multithreading.LectureTwo.InterruptTwo;

public class InterruptExample {
    public static void main(String[] args) throws InterruptedException{
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                if (Thread.currentThread().isInterrupted()) {
                    break;
                }
                System.out.println(i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
        Thread.sleep(1500);
        thread.interrupt();
    }
}
