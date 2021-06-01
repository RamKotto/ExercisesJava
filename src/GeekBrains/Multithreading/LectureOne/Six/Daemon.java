package GeekBrains.Multithreading.LectureOne.Six;

public class Daemon {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println(1));
        thread.setDaemon(true);
        thread.start();
    }
}
