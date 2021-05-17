package GeekBrains.Generics.Lecture.part5;

import java.util.ArrayList;
import java.util.Arrays;

public class WildCardDemoApp {
    public static void main(String[] args) {
        Stats<Integer> stInt = new Stats<>(1, 2, 3, 4, 5);
        Stats<Double> stDouble = new Stats<>(1.0, 2.0, 3.0, 4.0, 5.0);

        System.out.println("stInt.getAvg(): " + stInt.getAvg());
        System.out.println("stDouble.getAvg(): " + stDouble.getAvg());
        System.out.println("stInt.sameAvg(stDouble): ");

        if (stInt.sameAvg(stDouble)) {
            System.out.println("Средние значения равны!");
        } else {
            System.out.println("Средние значения не равны!");
        }

        Stats<Float> stFloat = new Stats<>(1.0f, 2.0f, 3.0f, 4.0f);

        System.out.println("stFloat.getAvg(): " + stFloat.getAvg());
        System.out.println("stDouble.sameAvg(stFloat): ");

        if (stDouble.sameAvg(stFloat)) {
            System.out.println("Средние значения равны!");
        } else {
            System.out.println("Средние значения не равны!");
        }

        // Test only (Wildcard extends)
        stDouble.doSomething(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)));
    }
}
