package GeekBrains.Generics.HomeTraining.Stats;

public class StatsDemoApp {
    public static void main(String[] args) {
        Stats<Integer> intStats = new Stats<>(1, 2, 3, 4, 5, 6);
        System.out.println("Среднее значение intStats равно: " + intStats.avg());

        Stats<Double> doubleStats = new Stats<>(1.0, 1.1, 1.2, 1.3, 2.0, 2.2, 3.5, 4.0, 8.0);
        System.out.println("Среднее значение doubleStats равно: " + doubleStats.avg());

        // Это не скомпелируется потому, что String не является подклассом Numbers:
        // Stats<String> stringStats = new Stats<>("1", "2", "3");
        // System.out.println("Среднее значение stringStats равно: " + stringStats.avg());
    }
}
