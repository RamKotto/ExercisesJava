package HomeTraining.Classes.ThisVsSuper;

public class Test {

    public static void main(String[] args) {
        ClassB classB = new ClassB();
        /*
        Вывод:
        Конструктор с одним аргументом класса А
        Конструктор с одним аргументом класса B
        Конструктор без аргументов класса B
         */
        ClassA classA = new ClassA();    // Вывод: Конструктор с одним аргументом класса А

    }
}
