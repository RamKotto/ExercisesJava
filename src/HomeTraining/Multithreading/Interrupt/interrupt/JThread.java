package HomeTraining.Multithreading.Interrupt.interrupt;

public class JThread extends Thread{
    JThread(String name) {
        super(name);
    }

    public void run() {
        System.out.printf("%s started... \n", Thread.currentThread().getName());
        int counter = 1;    // счетчик циклов
        while (!isInterrupted()) {
            System.out.println("Loop " + counter++);
            if (isInterrupted()) {
                System.out.println("JThread was interrupted!!! WARN!");
            }
        }
        System.out.printf("%s finished... \n", Thread.currentThread().getName());
    }
}
