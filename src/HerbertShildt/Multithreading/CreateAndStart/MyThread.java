package HerbertShildt.Multithreading.CreateAndStart;

public class MyThread implements Runnable{
    Thread thrd;  // переменная для хранения ссылки на поток

    // Создание нового потока на основе интерфейса и
    // присваивание ему имени.
    MyThread(String name) {
        thrd = new Thread(this, name);  // имя потоку присваивается при его создании
    }

    // Создание и запуск потока с помощью фабричного метода
    public static MyThread createAndStart(String name) {
        MyThread myThrd = new MyThread(name);

        myThrd.thrd.start();  // запуск потока
        return myThrd;
    }

    // Точка входа для потока
    public void run() {
        System.out.println(thrd.getName() + " - запуск");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("B " + thrd.getName() + ", счетчик: " + count);
            }
        } catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " - прерван.");
        }
        System.out.println(thrd.getName() + " - завершение.");
    }
}
