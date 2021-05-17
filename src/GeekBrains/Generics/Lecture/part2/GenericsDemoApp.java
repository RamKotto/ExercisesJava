package GeekBrains.Generics.Lecture.part2;

public class GenericsDemoApp {
    public static void main(String[] args) {
        TestGeneric<String> tg = new TestGeneric<>("Hello!");
        System.out.println(tg.getObj());
        tg.showType();
        tg.setObj("World!");
        System.out.println(tg.getObj());

        TestGeneric<Integer> tgInt = new TestGeneric<>(425);
        System.out.println(tgInt.getObj());
        tgInt.showType();

        // tgInt = tg;      Ошибка:
        // java.lang.String> cannot be converted to
        // GeekBrains.Generics.Lecture.part2.TestGeneric<java.lang.Integer>

    }
}
