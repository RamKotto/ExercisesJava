package GeekBrains.Generics.HomeTraining.TestGeneric;

public class TestGeneric<T> {
    private T obj;

    public TestGeneric(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void showType() {
        System.out.println("Тип Т: " + obj.getClass().getName());
    }
}
