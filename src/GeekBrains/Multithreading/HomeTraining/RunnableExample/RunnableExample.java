package GeekBrains.Multithreading.HomeTraining.RunnableExample;

public class RunnableExample implements Runnable{
    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("BANG!");
    }

    public static void main(String[] args) {
        Thread t = new Thread(new RunnableExample());
        t.start();
    }
}
