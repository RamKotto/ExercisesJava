package GeekBrains.Multithreading.LectureTwo.PingPongThree;


public class PingPong {
    private final Object mon = new Object();
    private volatile char currentLetter = 'I';

    public static void main(String[] args) {
        PingPong waitNotifyObj = new PingPong();
        Thread thread1 = new Thread(() -> {
            waitNotifyObj.printPing();
        });
        Thread thread2 = new Thread(() -> {
            waitNotifyObj.printPong();
        });
        thread1.start();
        thread2.start();
    }

    public void printPing() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 10; i++) {
                    while (currentLetter != 'I') {
                        mon.wait();
                    }
                    System.out.print("I");
                    currentLetter = 'O';
                    mon.notify();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printPong() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 10; i++){
                    while (currentLetter != 'O') {
                        mon.wait();
                    }
                    System.out.print("O");
                    currentLetter = 'I';
                    mon.notify();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
