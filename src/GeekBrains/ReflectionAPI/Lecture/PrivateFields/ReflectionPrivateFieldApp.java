package GeekBrains.ReflectionAPI.Lecture.PrivateFields;

import java.lang.reflect.Field;

public class ReflectionPrivateFieldApp {
    // final изменять нельзя
    public static void main(String[] args) {
        try {
            ClassWithPrivateField obj = new ClassWithPrivateField(10);
            obj.info();
            // получаем приватное поле "field" класса ClassWithPrivateField.class
            Field privateField = ClassWithPrivateField.class.getDeclaredField("field");
            // выставляем доступность поля в true
            privateField.setAccessible(true);
            // пытаемся прочесть приватное поле объекта (вывод: get 10)
            System.out.println("get " + privateField.get(obj));
            // устанавливаем новое значение приватному полю объекта
            privateField.set(obj, 1000);
            obj.info();
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
