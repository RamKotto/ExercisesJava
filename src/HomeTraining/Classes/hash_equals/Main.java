package HomeTraining.Classes.hash_equals;

public class Main {
    public static void main(String[] args) {
        SomeStringify strOne = new SomeStringify();
        SomeStringify strTwo = new SomeStringify();
        SomeStringify strThree = new SomeStringify();

        strOne.setS("qqq");
        strTwo.setS("qqq");
        strThree.setS("www");

        System.out.println(strOne.equals(strTwo));
        System.out.println(strOne.equals(strThree));
    }
}
