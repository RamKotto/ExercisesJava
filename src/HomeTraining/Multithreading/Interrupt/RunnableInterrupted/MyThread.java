package HomeTraining.Multithreading.Interrupt.RunnableInterrupted;

public class MyThread implements Runnable{

//    @Override
//    public void run() {
//        System.out.printf("%s started... \n", Thread.currentThread().getName());
//        int counter = 1;  // счетчик циклов
//        while (!Thread.currentThread().isInterrupted()) {
//            System.out.println("Loop " + counter++);
//        }
//        System.out.printf("%s finished... \n", Thread.currentThread().getName());
//    }

    @Override
    public void run(){
        System.out.printf("%s started... \n", Thread.currentThread().getName());
        int counter=1; // счетчик циклов
        try{
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Loop " + counter++);
                Thread.sleep(100);
            }
        } catch(InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " has been interrupted");
        }
        System.out.printf("%s finished... \n", Thread.currentThread().getName());
    }
}
