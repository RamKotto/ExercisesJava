package GeekBrains.ReflectionAPI.Lecture.Constructors;

import java.lang.reflect.Constructor;

public class ReflectionApp {
    public static void main(String[] args) {
        Constructor[] constructors = Cat.class.getConstructors();
        for (Constructor o  : constructors) {
            System.out.println(o);
        }
        /*
        public GeekBrains.ReflectionAPI.Lecture.Constructors.Cat(java.lang.String)
        public GeekBrains.ReflectionAPI.Lecture.Constructors.Cat(java.lang.String,int)
        public GeekBrains.ReflectionAPI.Lecture.Constructors.Cat(java.lang.String,java.lang.String,int)
         */

        System.out.println("---");
        try {
            System.out.println(Cat.class.getConstructor(new Class[] {String.class, int.class}));
        } catch (NoSuchMethodException e ) {
            e.printStackTrace();
        }
        /*
        ---
        public GeekBrains.ReflectionAPI.Lecture.Constructors.Cat(java.lang.String,int)
         */
    }
}
