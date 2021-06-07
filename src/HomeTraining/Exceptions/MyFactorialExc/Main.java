package HomeTraining.Exceptions.MyFactorialExc;

public class Main {

    public static void main(String[] args) {
        try {
            int result = Factorial.getFactorial(0);
            System.out.println(result);
        } catch (FactorialException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getNumber());
        }
        /*
        The number is less than 1
        0
         */

        try {
            int result = Factorial.getFactorial(6);
            System.out.println(result);    // 720
        } catch (FactorialException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getNumber());
        }
    }
}
