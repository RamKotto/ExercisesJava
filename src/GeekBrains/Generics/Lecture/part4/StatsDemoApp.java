package GeekBrains.Generics.Lecture.part4;

import java.util.Arrays;

public class StatsDemoApp {
    public static void main(String[] args) {
        Stats<Integer> stats = new Stats<>(1, 2, 3, 4, 5);
        System.out.println("stats.getNumbers() : " + Arrays.asList(stats.getNumbers()));
        System.out.println("stats.getAvg() = " + stats.getAvg());

        // Stream API
        Arrays.stream(stats.getNumbers())  // превращаем массив в поток
                .filter(p -> p % 2 != 0)  // фильтр
                .map(p -> p * 5)  // преобразователь
                .sorted((o1, o2) -> o2 - o1)  // сортировка
                .forEach(System.out::println);
    }
}
