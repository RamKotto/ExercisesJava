package GeekBrains.ReflectionAPI.Lecture.getDecalredMethods;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Method[] methods = Cat.class.getDeclaredMethods();
        for (Method o : methods) {
            System.out.println(o.getReturnType() + " ||| " + o.getName() + " ||| " +
                    Arrays.toString(o.getParameterTypes()));
        }
        try {
            Method m1 = Cat.class.getMethod("jump", null);
            Method m2 = Cat.class.getMethod("meow", int.class);
            System.out.println(m1 + " | " + m2);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        Cat cat = new Cat("Barsik");
        try {
            Method mMeow = Cat.class.getDeclaredMethod("meow", int.class);
            mMeow.invoke(cat, 5);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
