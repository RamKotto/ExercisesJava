package HomeTraining.Exceptions.SimpleExceptions;

public class Examples {

    public static void main(String[] args) {
        try {
            int x = 100 / 0;
        } catch (ArithmeticException e) {
            System.out.println("It's ERROR, Bro!");
            System.out.println(e);
        } finally {
            System.out.println("Блок Finally");
        }

    }
}
