package GeekBrains.Multithreading.LectureTwo.PingpongOne;

public class PingPong {
    public static void main(String[] args) {
        PingPong waitNotifyApp = new PingPong();
        new Thread(() -> {
            waitNotifyApp.printPing();
        }).start();
        new Thread(() -> {
            waitNotifyApp.printPong();
        }).start();
    }

    public void printPing() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Ping");
        }
    }

    public void printPong() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Pong");
        }
    }
}
