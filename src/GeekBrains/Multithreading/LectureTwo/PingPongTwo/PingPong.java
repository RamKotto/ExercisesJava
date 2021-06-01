package GeekBrains.Multithreading.LectureTwo.PingPongTwo;

public class PingPong {
    public static void main(String[] args) {
        PingPong waitNotifyApp = new PingPong();
        new Thread( () -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            waitNotifyApp.printPing();
        }).start();
        new Thread( () -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            waitNotifyApp.printPong();
        }).start();
    }

    public void printPing() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Ping!");
        }
    }

    public void printPong() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Pong!");
        }
    }
}
