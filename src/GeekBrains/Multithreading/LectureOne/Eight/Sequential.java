package GeekBrains.Multithreading.LectureOne.Eight;

public class Sequential {

    public static class Counter {
        private int value;

        public int getValue() {
            return value;
        }

        public void increment() {
            value++;
        }

        public void decrement() {
            value--;
        }
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        for (int i  = 0; i < 1000; i++) {
            counter.increment();
        }

        for (int i = 0; i < 1000; i++) {
            counter.decrement();
        }

        System.out.println(counter.getValue());
    }
}
