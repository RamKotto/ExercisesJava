package HomeTraining.reflection_api.training_field;

import java.lang.reflect.Field;

public class Reflect {

    public static void main(String[] args)  {
        MyPrivateClass myPrivateClass = new MyPrivateClass();
        String f = null;

        try {
            Field field = MyPrivateClass.class.getDeclaredField("name");
            field.setAccessible(true);
            f = (String) field.get(myPrivateClass);
        } catch (IllegalAccessException | NoSuchFieldException ex) {
            ex.printStackTrace();
        }

        System.out.println(f);

        try {
            Field field = MyPrivateClass.class.getDeclaredField("name");
            field.setAccessible(true);
            field.set(myPrivateClass, "Hello World!");
            f = (String) field.get(myPrivateClass);
        } catch (IllegalAccessException | NoSuchFieldException ex) {
            ex.printStackTrace();
        }
        System.out.println(f);
    }
}
