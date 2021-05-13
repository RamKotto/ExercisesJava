package GeekBrains.Generics.HomeTraining.TestGeneric;

public class GenericsDemoApp {
    public static void main(String[] args) {
        TestGeneric<String> genStr = new TestGeneric<>("Hello");
        genStr.showType();
        System.out.println("genStr.getObject(): " + genStr.getObj());

        TestGeneric<Integer> genInt = new TestGeneric<>(140);
        genInt.showType();
        System.out.println("genInt.getObj(): " + genInt.getObj());
    }
}
