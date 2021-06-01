package GeekBrains.Multithreading.LectureOne.Nine;

public class Example1 {

    public static void main(String[] args) {
        Example1 e1 = new Example1();
        System.out.println("Start");

        // Один объект, один синхронизированный метод за раз.
        new Thread(() -> e1.method1()).start();
        new Thread(() -> e1.method2()).start();

//        // Два объекта - два синхронизированных метода за один раз.
//        Example1 e2 = new Example1();
//        new Thread(() -> e1.method1()).start();
//        new Thread(() -> e2.method2()).start();
    }

    public synchronized void method1() {
        System.out.println("method one - begin");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("method one - end");
    }

    public synchronized void method2() {
        System.out.println("method two - begin");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("method two - end");
    }
}
