package GeekBrains.ReflectionAPI.Lecture.ReflectionApp;

public class ReflectionApp {
    public static void main(String[] args) {
//        getClassFromObject();
        /*
        Вывод:
        java.lang.String
        String
         */

//        getClassFromClass();
        /*
        Вывод:
        [C
        [[C
        [[[C
        char[]
        char[][]
        char[][][]
         */

        getClassFromForName();
        /*
        Вывод (для нормальных людей):
        org.sqlite.JDBC
         */
    }

    public static void getClassFromObject() {
        Class<?> stringClass = "Java".getClass();
        System.out.println(stringClass.getName());
        System.out.println(stringClass.getSimpleName());
    }

    public static void getClassFromClass() {
        Class<?> integerClass = Integer.class;
        Class<?> stringClass = String.class;
        Class<?> intClass = int.class;
        Class<?> voidClass = void.class;
        Class<?> charArrayClass = char[].class;
        Class<?> charArray2Class = char[][].class;
        Class<?> charArray3Class = char[][][].class;

        System.out.println(charArrayClass.getName());
        System.out.println(charArray2Class.getName());
        System.out.println(charArray3Class.getName());

        System.out.println(charArrayClass.getSimpleName());
        System.out.println(charArray2Class.getSimpleName());
        System.out.println(charArray3Class.getSimpleName());
    }

    public static void getClassFromForName() {
        try {
            Class<?> jdbcClass = Class.forName("org.sqlite.JDBC");
            System.out.println(jdbcClass.getName());
        } catch (ClassNotFoundException e) {
            System.out.println("Чувак! У тебя нет Dependencies в Maven!))");
            System.out.println("Потому, что это не Maven project!))");
            System.out.println("Вывод был ты такой, заведи ты pom.xml:");
            System.out.println("org.sqlite.JDBC");
        }

    }
}
