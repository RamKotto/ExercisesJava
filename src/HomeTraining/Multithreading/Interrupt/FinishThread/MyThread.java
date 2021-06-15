package HomeTraining.Multithreading.Interrupt.FinishThread;

public class MyThread implements Runnable {

    public boolean isActive;

    void disable() {
        isActive = false;
    }

    public MyThread() {
        isActive = true;
    }

    @Override
    public void run() {
        System.out.printf("%s thread started!\n", Thread.currentThread().getName());
        int counter = 1;    // счетчик циклов
        while (isActive) {
            System.out.println("Loop: " + counter++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread has been interrupted!");
            }

        }
        System.out.printf("%s has finished...\n", Thread.currentThread().getName());

    }
}
