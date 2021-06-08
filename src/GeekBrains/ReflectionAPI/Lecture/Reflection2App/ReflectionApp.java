package GeekBrains.ReflectionAPI.Lecture.Reflection2App;

import java.lang.reflect.Modifier;
import java.util.ArrayList;

public class ReflectionApp {

    public static void main(String[] args) {
        Class<?> strClass = String.class;
        int modifiers = strClass.getModifiers();
        /*
        isPublic(); isPrivate(); isAbstract(); isFinal(); isNative();
        isInterface(); isSynchronized(); isVolatile();
        isStrict(); isTransient(); isProtected(); isStatic();
        ...
         */
        if (Modifier.isPublic(modifiers)) {
            System.out.println(strClass.getSimpleName() + " is public!");
        }
        if (Modifier.isAbstract(modifiers)) {
            System.out.println(strClass.getSimpleName() + " is abstract!");
        }
        if (Modifier.isFinal(modifiers)) {
            System.out.println(strClass.getSimpleName() + " is final!");
        }

        getSuperClass(strClass);
        /*
        Вывод:
        java.lang.String parents are:
        java.lang.Object
         */

        getSuperClass(ArrayList.class);
        /*
        Вывод:
        java.util.ArrayList parents are:
        java.util.AbstractList
        java.util.AbstractCollection
        java.lang.Object
         */

        getInterface(ArrayList.class);
        /*
        Вывод:
        java.util.ArrayList parents are:
        java.util.AbstractList
        java.util.AbstractCollection
        java.lang.Object
         */
    }

    public static void getSuperClass(Class<?> aClass) {
        System.out.println(aClass.getName() + " parents are: ");
        Class<?> superClass = aClass.getSuperclass();
        while (superClass != null) {
            System.out.println(superClass.getName());
            superClass = superClass.getSuperclass();
        }
    }

    public static void getInterface(Class<?> aCLass) {
        for (Class<?> inter : aCLass.getInterfaces()) {
            System.out.println(inter.getName());
        }
    }
}
