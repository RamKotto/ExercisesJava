package GeekBrains.Generics.Lecture.part3;

public class TwoGenApp {
    public static void main(String[] args) {
        TwoGen<Integer, String> firstEntity;
        firstEntity = new TwoGen<>(1, "Dmitriy");

        System.out.print(firstEntity.getObj1() + ") ");
        System.out.println(firstEntity.getObj2());

        firstEntity.showTypes();
    }
}
