package GeekBrains.Generics.HomeWork.Check;

import GeekBrains.Generics.HomeWork.Check.Fruit.Apple;
import GeekBrains.Generics.HomeWork.Check.Fruit.Box;
import GeekBrains.Generics.HomeWork.Check.Fruit.Orange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Integer[] intArr = new Integer[] {0, 1, 2, 3};
        Main.swap(intArr, 3, 2);
        System.out.println(Arrays.toString(intArr));

        String[] strArr = new String[] {"Жили", "у", "бабуси", "два", "веселых", "гуся"};
        Main.swap(strArr, 1, 3);
        System.out.println(Arrays.toString(strArr));

        // Последний элемент не будет добавлен.
        Box<Apple> box1 = new Box<>();
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
//        box1.addFruit(new Orange());

        Box<Apple> box2 = new Box<>();
        box2.addFruit(new Apple());

        // Сравнение двух коробок с яблоками по весу.
        // Добавление во вторую коробку яблока.
        boolean firstTry = box1.compareByTypeAndWeight(box2);
        System.out.println(firstTry);
        box2.addFruit(new Apple());
        boolean secondTry = box1.compareByTypeAndWeight(box2);
        System.out.println(secondTry);

        // Создаем коробку с апельсинами.
        Box<Orange> box3 = new Box<>();
        box3.addFruit(new Orange());
        box3.addFruit(new Orange());

        // Сравниваем вес коробки с яблоками и апельсинами.
        System.out.println("Вес box1 и box3 идентичен: " + box1.compareByWeight(box3));

        // Пересыпаем яблоки из box1 в box2
        System.out.println("Вес первой коробки, до пересыпания: " + box1.getWeight());
        System.out.println("Вес второй коробки, до пересыпания: " + box2.getWeight());
        box1.pourTo(box2);
        System.out.println("Вес первой коробки, после пересыпания: " + box1.getWeight());
        System.out.println("Вес второй коробки, после пересыпания: " + box2.getWeight());

    }

    // меняем местами элементы масива
    public static <T> void swap(T[] arr, int from, int to) {
        if (from >= arr.length || to >= arr.length || from == to){
            return;
        }
        T tmp = arr[from];
        arr[from] = arr[to];
        arr[to] = tmp;
    }

    // преобразуем массив в ArrayList
    public static <T> ArrayList<T> arrayToArrayList(T[] arr) {
        return new ArrayList<>(Arrays.asList(arr));
    }

    // преобразуем массив в List
    public static <T> List<T> arrayToList(T[] arr) {
        return Arrays.asList(arr);
    }
}
