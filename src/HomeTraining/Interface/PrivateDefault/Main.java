package HomeTraining.Interface.PrivateDefault;

public class Main {
    public static void main(String[] args) {
        Calculable c = new Calculator();
        System.out.println(c.sum(1, 2, 3));
        System.out.println(c.sum(2, 3));
        /*
        6
        5
         */
    }
}

class Calculator implements Calculable {

}

interface Calculable {
    // метод по умолчанию
    default int sum(int a, int b) {
        return sumAll(a, b);
    }

    // метод по умолчанию
    default int sum(int a, int b, int c) {
        return sumAll(a, b, c);
    }

    // приватный метод
    default int sumAll(int... values) {  // private int sumAll(int... values) должно быть так
        int result = 0;
        for (int i : values) {
            result += i;
        }
        return result;
    }
}
