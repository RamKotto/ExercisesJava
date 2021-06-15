package HomeTraining.Multithreading.Interrupt.RunnableInterrupted;

public class Program {

    public static void main(String[] args) {

        System.out.println("Main thread started...");
        MyThread myThread = new MyThread();
        Thread t = new Thread(myThread, "MyThread");
        t.start();
        try {
            Thread.sleep(40);
            t.interrupt();
            Thread.sleep(40);
        } catch (InterruptedException e) {
            System.out.println("Thread has been interrupted!");
        }
        System.out.println("Main thread has finished!");
    }
}
