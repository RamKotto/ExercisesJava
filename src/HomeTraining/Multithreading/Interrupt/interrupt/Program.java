package HomeTraining.Multithreading.Interrupt.interrupt;

public class Program {
    public static void main(String[] args) {
        System.out.println("Main thread started...");
        JThread t = new JThread("JThread");
        t.start();
        try {
            Thread.sleep(40);
            t.interrupt();
            Thread.sleep(40);
        } catch (InterruptedException e) {
            System.out.println("Thread has been interrupted");
        }
        System.out.println("Main thread finished");
    }
}
