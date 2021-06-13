package GeekBrains.ReflectionAPI.Lecture.Annotations;

import java.lang.reflect.Method;

public class AnnotationApp {

    @MarkingAnnotation
    public void markedMethod() {
        System.out.println("Java");
    }
    @AdvancedAnnotation(value = 20.0f)
    public void advAnnotatedMethod() {
        System.out.println("...");
    }

//    public static void main(String[] args) {
//        Method[] methods = AnnotationApp.class.getDeclaredMethods();
//        for (Method m : methods) {
//            if (m.getAnnotation(MarkingAnnotation.class) != null) {
//                System.out.println(m);   // Вернет все методы помеченные @MarkingAnnotation
//            }
//        }
//    }

    public static void main(String[] args) {
        try {
            Method m = AnnotationApp.class.getMethod("advAnnotatedMethod", null);
            AdvancedAnnotation annotation = m.getAnnotation(AdvancedAnnotation.class);
            System.out.println("value: " + annotation.value());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
