package Webinars.Generics.FirstTest;

public class Main {
    public static void main(String[] args) {
        Integer myInt = 20;
        String myStr = "Java";

        System.out.println(getObjName(myStr));
        System.out.println(getClassName(myStr));

        System.out.println(getObjName(myInt));
        System.out.println(getClassName(myInt));

    }

    public static <T> String getObjName(T t) {
        return t.toString();
    }

    public static <T> String getClassName(T t) {
        return t.getClass().getName();
    }

}
