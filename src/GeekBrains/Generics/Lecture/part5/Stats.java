package GeekBrains.Generics.Lecture.part5;

import java.util.Arrays;
import java.util.List;

public class Stats<T extends Number> {
    private T[] numbers;

    public Stats(T... numbers) {
        this.numbers = numbers;
    }

    public double getAvg() {
        double sum = 0.0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i].doubleValue();
        }
        return sum / numbers.length;
    }

    public boolean sameAvg(Stats<?> another) {
        return Math.abs(this.getAvg() - another.getAvg()) < 0.0001;
    }

    // Test only
    public void doSomething(List<? extends Number> someList) {
        System.out.println(Arrays.toString(this.numbers));
        System.out.println(someList);
    }
}
