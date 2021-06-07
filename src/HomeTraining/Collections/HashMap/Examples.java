package HomeTraining.Collections.HashMap;

import java.util.*;

public class Examples {

    public static void main(String[] args) {
        Map<Integer, String> phoneBook = new HashMap<>();
        // [Integer], [String]  как мы и указали выше
        phoneBook.put(5555555, "Elena");
        phoneBook.put(1111111, "Mike");
        phoneBook.put(2222222, "Joe");
        phoneBook.put(3333333, "Lazar");

        // получаем объект по ключу
        String first = phoneBook.get(3333333);
        System.out.println(first);    // Lazar

        // получим весь набор ключей
        Set<Integer> keys = phoneBook.keySet();
        System.out.println(keys);    // [5555555, 1111111, 3333333, 2222222]

        // получим весь набор значений
        Collection<String> values = phoneBook.values();
        System.out.println(values);    // [Elena, Mike, Lazar, Joe]

        // замена элемента [key], [value]
        phoneBook.replace(1111111, "Bryan");
        Collection<String> names = phoneBook.values();
        System.out.println(names);    // [Elena, Bryan, Lazar, Joe]

        // удаление элемента по ключу [key:1111111]
        phoneBook.remove(1111111);
        System.out.println(names);    // [Elena, Lazar, Joe]

        // перебор элементов
        for (Map.Entry<Integer, String> item : phoneBook.entrySet()) {
            System.out.printf("Key: %d Value: %s \n", item.getKey(), item.getValue());
        }
        /*
        Key: 5555555 Value: Elena
        Key: 3333333 Value: Lazar
        Key: 2222222 Value: Joe
         */
    }
}
