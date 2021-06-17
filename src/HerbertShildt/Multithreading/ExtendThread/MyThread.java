package HerbertShildt.Multithreading.ExtendThread;

public class MyThread extends Thread{

    // конструктор нового потока
    MyThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println(this.getName() + " - запуск.");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("В " + this.getName() + ", счетчик: " + count);
            }
        } catch (InterruptedException exc) {
            System.out.println(this.getName() + " - прерван.");
        }
        System.out.println(this.getName() + " - завершение.");
    }

    public static MyThread createAndStart(String name) {
        MyThread myThrd = new MyThread(name);

        myThrd.start();

        return myThrd;
    }
}
