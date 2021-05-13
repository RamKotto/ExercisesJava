package GeekBrains.Generics.HomeTraining.StatsAdvanced;

public class Stats<T extends Number> {
    private T[] numbers;

    public Stats(T... numbers) {
        this.numbers = numbers;
    }

    public double avg() {
        double sum = 0.0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i].doubleValue();
        }
        return sum / numbers.length;
    }

    public boolean sameAvg(Stats<?> another) {
        return Math.abs(this.avg() - another.avg()) < 0.0001;
    }
}
