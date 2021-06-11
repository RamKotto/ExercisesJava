package GeekBrains.ReflectionAPI.Lecture.ReflectionFields;

import java.lang.reflect.Field;
import java.util.Arrays;

public class ReflectionFieldsApp {
    public static void main(String[] args) throws NoSuchFieldException {
        Class catClass = Cat.class;

        Field[] publicFields = catClass.getFields();
        for (Field  o : publicFields) {
            System.out.println(o.getType().getName() + " " + o.getName());
        }
        /*
        Вывод:
        java.lang.String name
        java.lang.String color
        int age
         */

        Field[] allFields = catClass.getDeclaredFields();
        for (Field o : allFields) {
            System.out.println(o.getType().getName() + " " + o.getName());
        }
        /*
        Вывод:
        java.lang.String name
        java.lang.String color
        int age
        java.lang.String secretName
         */

        Cat cat1 = new Cat();
        Field f = catClass.getDeclaredField("secretName");
        try {
            // передаем объект, относительно которого хотим получить значение поля
            System.out.println(f.get(cat1));
        } catch (IllegalAccessException e ) {
            e.printStackTrace();
        }
        /*
        В данном случае, выводом будет исключение.
         */

        setCatFields();
    }

    public static void setCatFields() {
        try {
            // создаем объект
            Cat cat = new Cat();
            // получаем поле класса
            Field fieldName = cat.getClass().getField("name");
            // устанавливаем значение поля объекту созданному выше
            fieldName.set(cat, "Murzilka");
            // получаем поле "возраст" класса Cat
            Field fieldAge = cat.getClass().getField("age");
            // пытаемся прочитать значение возраста (Вывод: 0);
            System.out.println(fieldAge.get(cat));
            // устанавливаем новое значение полю age у объукта Cat
            fieldAge.set(cat, 34);
            // пытаемся прочитать значение возраста (Вывод: 34);
            System.out.println(cat.age);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
