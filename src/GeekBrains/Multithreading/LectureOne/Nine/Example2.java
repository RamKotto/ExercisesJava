package GeekBrains.Multithreading.LectureOne.Nine;


public class Example2 {
    private final Object lock1 = new Object();

    public static void main(String[] args) {
        Example2 e2 = new Example2();
        System.out.println("Start");

        new Thread(() -> e2.method1()).start();
        new Thread(() -> e2.method1()).start();

//      Два разных объекта могут выполнять блок synchronized параллельно друг другу
//        Example2 e3 = new Example2();
//        new Thread(() -> e3.method1()).start();
    }

    public void method1() {
        System.out.println("Block - 1 begin");
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Block - 1 end");
        synchronized (lock1) {
            System.out.println("Synch - 2 begin");
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Synch - 2 end");
        }
    }
}
