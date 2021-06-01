package GeekBrains.Multithreading.LectureTwo.InterruptThree;

public class InterruptedExample {
    public static void main(String[] args) throws InterruptedException{
        Thread thread = new Thread(() -> {
            boolean interrupted = false;
            for (int i = 0; i < 10; i++) {
                if (Thread.currentThread().isInterrupted() || interrupted) {
                    break;
                }
                System.out.println(i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    interrupted = true;
                }
            }
        });
        thread.start();
        Thread.sleep(1500);
        thread.interrupt();
    }
}
