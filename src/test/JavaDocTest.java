package test;

/**
 * This is a JavaDoc class comment
 */
public class JavaDocTest {

    /**
     * This is a JavaDoc public field comment
     */
    public static final String HELLO_MESSAGE = "Hello, World!";

    public static void main(String... args) {
        JavaDocTest.greetings();
    }

    /**
     * This is a JavaDoc public method comment
     */
    public static void greetings() {
        System.out.println(HELLO_MESSAGE);
    }
}

/*
Создаем с помощью "javadoc -d ./test JavaDocTest.java"  - из директории файла
И потом открываем созданный index.html
 */
