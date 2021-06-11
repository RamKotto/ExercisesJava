package GeekBrains.ReflectionAPI.Lecture.Constructors;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionConstructorsApp {
    public static void main(String[] args) {
        try {
            Class someClass = Cat.class;
            Constructor catConstructor = Cat.class.getConstructor(String.class, String.class, int.class);
            Cat cat1 = (Cat)someClass.newInstance();
            Cat cat2 = (Cat)catConstructor.newInstance("Murochka", "Black", 48);

            cat1.info();
            /*
            Name null
            Color null
            Age 0
             */

            cat2.info();
            /*
            Name Murochka
            Color Black
            Age 48
             */

        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException |
                InvocationTargetException e) {
            e.printStackTrace();
        }


    }
}
