package GeekBrains.Multithreading.LectureOne.Four;

public class Main {

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++){
                    System.out.println(i);
                }
            }
        });

        thread.start();

    }
}
