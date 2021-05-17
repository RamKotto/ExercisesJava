package GeekBrains.Generics.Lecture.part1;

public class BoxDemoApp {
    public static void main(String[] args) {
        SimpleBox firstBox = new SimpleBox(5);
        SimpleBox secondBox = new SimpleBox(10);

        if (firstBox.getObj() instanceof Integer && secondBox.getObj() instanceof Integer) {
            int sum = (Integer) firstBox.getObj() + (Integer) secondBox.getObj();
            System.out.println("sum = " + sum);
        } else {
            System.out.println("Типы данных в коробках отличаются.");
        }

        // Вызвали какой-нибудь метод, которому отдали firstBox
        // и этот метод положил в firstBox String:
        firstBox.setObj("Hello!");

        // Продолжаем наш код, и при выполнении мы получим ClassCastException
        int newSum = (Integer) firstBox.getObj() + (Integer) secondBox.getObj();
    }
}
