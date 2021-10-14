package Webinars.StreamAPI;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainApp {
    private static class Person {
        private String name;
        private String position;
        private int age;

        private Person(String name, String position, int age) {
            this.name = name;
            this.position = position;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println(list);

//        list.stream()
//                .filter(n -> n % 2 == 0)
//                .forEach(System.out::println);

//        List<Integer> out = list.stream()
//                .filter(n -> n % 2 != 0)
//                .collect(Collectors.toList());
//        System.out.println(out);

//        list.stream()
//                .map(n -> n * 5)
//                .forEach(System.out::println);
//
//        list.stream()
//                .map(n -> {
//                    StringBuilder sb = new StringBuilder();
//                    for (int i = 0; i < n; i++) {
//                        sb.append("A");
//                    }
//                    return sb.toString();
//                })
//                .forEach(System.out::println);

//        System.out.println(list.stream()
//                .filter(n -> n < 6)
//                .count());

//        List<Integer> randomSequenceList = new ArrayList<>(Arrays.asList(5, 3, 8, 1, 15, 4, 7, 12));
//        System.out.println(randomSequenceList);

//        randomSequenceList.stream()
//                .sorted()
//                .limit(3)
//                .forEach(System.out::println);

//        System.out.println(randomSequenceList.stream()
//                .allMatch(n -> n > 0));
//
//        boolean res = true;
//        for (Integer i : randomSequenceList) {
//            if (i <= 0) {
//                res = false;
//                break;
//            }
//        }

//        Optional<Integer> opt = randomSequenceList.stream()
//                .filter(n -> n < 3)
//                .findFirst();
//        opt.ifPresent(System.out::println);
//        Integer res = opt.orElse(10);
//        opt.orElseThrow(() -> new RuntimeException("Something went wrong!"));
//        System.out.println(opt.get());
//
//        List<String> strList = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));
//        System.out.println(strList.stream().noneMatch(str -> str.equals("F")));
//        String[] arr = {"A", "B", "C"};
//        Stream<String> arrStream = Arrays.stream(arr);
//        Stream<String> streamBuilder = Stream.of("A", "B", "C");
//    }
//
//    private static void firstExample() {
//        List<Person> persons = new ArrayList<>(Arrays.asList(
//                new Person("Bob1", "Engineer", 45),
//                new Person("Bob2", "Engineer", 37),
//                new Person("Bob3", "Manager", 31),
//                new Person("Bob4", "Manager", 34),
//                new Person("Bob5", "Engineer", 44),
//                new Person("Bob6", "CEO", 50)
//        ));
//        // Составляем список из инженеров:
//        List<Person> engineers = new ArrayList<>();
//        for (Person p : persons) {
//            if (p.position.equals("Engineer")) {
//                engineers.add(p);
//            }
//        }
//        // Сортируем инженеров по возрасту:
//        Collections.sort(engineers, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.age - o2.age;
//            }
//        });
//        // Выводим имена инженеров:
//        List<String> engineersNames = new ArrayList<>();
//        for (Person p : engineers) {
//            engineersNames.add(p.name);
//        }
//        System.out.println(engineersNames);
//
//        // Делаем то же самое, при помощи Stream:
//        List<String> engNames = persons.stream()
//                .filter(p -> p.position.equals("Engineer"))
//                .sorted((o1, o2) -> o1.age - o2.age)
//                .map(p -> p.name)
//                .collect(Collectors.toList());
//        System.out.println(engNames);
    }
}


/*
Runnable r1 = () -> System.out.println(1);
Runnable r2 = () -> System.out.println(2);

new Thread(r1).start();
new Thread(r2).start();
 */
