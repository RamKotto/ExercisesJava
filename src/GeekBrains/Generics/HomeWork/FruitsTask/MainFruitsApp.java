package GeekBrains.Generics.HomeWork.FruitsTask;

public class MainFruitsApp {
    public static void main(String[] args) {
        Apple appleOne = new Apple();
        Apple appleTwo = new Apple();
        Apple appleThree = new Apple();
        Apple appleFour = new Apple();

        Orange orangeOne = new Orange();
        Orange orangeTwo = new Orange();
        Orange orangeThree = new Orange();

        Box<Apple> appleBox = new Box<>(appleOne, appleTwo);
        System.out.println(appleBox.getFruitBox());
        appleBox.addFruitToBox(appleThree);
        appleBox.addFruitToBox(appleFour);

        Box<Orange> orangeBox = new Box<>(orangeOne);
        orangeBox.addFruitToBox(orangeTwo);
        orangeBox.addFruitToBox(orangeThree);

        System.out.println("Количество яблок в коробке: " + appleBox.getCountOfFruits());
        System.out.println("Вес коробки с яблоками: " + appleBox.getWeight());
        System.out.println("Количество апельсинов в коробке: " + orangeBox.getCountOfFruits());
        System.out.println("Вес коробки с апельсинами: " + orangeBox.getWeight());

        if (appleBox.compare(orangeBox)) {
            System.out.println("Вес коробок с яблоками и апельсинами - одинаковый.");
        } else {
            System.out.println("Вес коробок с яблоками и апельсинами - разный.");
        }

        Box<Orange> secondOrangeBox = new Box<>();
        System.out.println("secondOrangeBox: " + secondOrangeBox.getFruitBox());
        System.out.println("orangeBox: " + orangeBox.getFruitBox());
        orangeBox.shiftFruits(secondOrangeBox);
        System.out.println("orangeBox.shiftFruits(secondOrangeBox);");
        System.out.println("secondOrangeBox: " + secondOrangeBox.getFruitBox());
        System.out.println("orangeBox: " + orangeBox.getFruitBox());
        System.out.print("Теперь количество апельсинов в коробке secondOrangeBox: ");
        System.out.println(secondOrangeBox.getCountOfFruits());
        Box<Orange> thirdOrangeBox = new Box<>(
                new Orange(),
                new Orange());

        System.out.println("thirdOrangeBox.shiftFruits(secondOrangeBox);");
        thirdOrangeBox.shiftFruits(secondOrangeBox);
        System.out.print("А теперь количество апельсинов в коробке secondOrangeBox: ");
        System.out.println(secondOrangeBox.getCountOfFruits());

    }
}
