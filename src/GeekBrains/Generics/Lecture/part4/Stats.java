package GeekBrains.Generics.Lecture.part4;

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

    public T[] getNumbers() {
        return numbers;
    }

}
