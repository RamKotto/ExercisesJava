package GeekBrains.Multithreading.LectureOne.Eight;

public class Parallel {

    public static class Counter {
        private int value;

        public int getValue(){
            return value;
        }

        public void increment() {
            value++;
        }

        public void decrement() {
            value--;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.decrement();
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(counter.getValue());
    }
}
