package GeekBrains.Generics.HomeTraining.StatsAdvanced;

public class WildcardDemoApp {
    public static void main(String[] args) {
        Stats<Integer> intStats = new Stats<>(1, 2, 3, 4, 5);
        System.out.println("intStats.avg(): " + intStats.avg());

        Stats<Double> doubleStats = new Stats<>(1.1, 2.2, 3.3, 4.4, 5.5);
        System.out.println("doubleStats.avg(): " + doubleStats.avg());

        Stats<Float> floatStats = new Stats<>(1.0f, 2.0f, 3.0f, 4.0f, 5.0f);
        System.out.println("floatStats.avg(): " + floatStats.avg());

        System.out.print("intStats.sameAvg(doubleStats): ");
        if (intStats.sameAvg(doubleStats)) {
            System.out.println(" - РАВНЫ!");
        } else {
            System.out.println(" - ОТЛИЧАЮТСЯ!");
        }

        System.out.print("intStats.sameAvg(floatStats): ");
        if (intStats.sameAvg(floatStats)) {
            System.out.println(" - РАВНЫ!");
        } else {
            System.out.println(" - ОТЛИЧАЮТСЯ!");
        }
    }
}
