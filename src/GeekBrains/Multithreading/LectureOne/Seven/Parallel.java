package GeekBrains.Multithreading.LectureOne.Seven;

public class Parallel {
//    последовательность:
//    public static void main(String[] args) {
//        System.out.println(1);
//        System.out.println(2);
//    }


    // параллельность:
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            System.out.println(1);
        });
        Thread thread2 = new Thread(() -> {
            System.out.println(2);
        });

        thread1.start();
        thread2.start();
    }
}
