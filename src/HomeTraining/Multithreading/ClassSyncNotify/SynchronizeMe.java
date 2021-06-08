package HomeTraining.Multithreading.ClassSyncNotify;


public class SynchronizeMe {
    public static char CHAR = 'A';

    public static void main(String[] args) {
        new Thread(SynchronizeMe::printA).start();
        new Thread(SynchronizeMe::printB).start();
    }

    public static void printA() {
        synchronized (SynchronizeMe.class) {
            try {
                for (int i = 0 ; i < 3; i++) {
                    while (CHAR != 'A') {
                        SynchronizeMe.class.wait();
                    }
                    System.out.print(CHAR + " ");
                    CHAR = 'B';
                    SynchronizeMe.class.notify();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void printB() {
        synchronized (SynchronizeMe.class) {
            try {
                for (int i = 0 ; i < 3; i++) {
                     while (CHAR != 'B') {
                        SynchronizeMe.class.wait();
                    }
                    System.out.print(CHAR + " ");
                    CHAR = 'A';
                    SynchronizeMe.class.notify();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
