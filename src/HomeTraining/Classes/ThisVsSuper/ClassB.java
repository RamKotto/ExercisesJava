package HomeTraining.Classes.ThisVsSuper;

public class ClassB extends ClassA{

    ClassB() {
        this("");    // вызов конструктора с одним аргументом класса B
        System.out.println("Конструктор без аргументов класса B");
    }

    ClassB(String args) {
        super("");    // вызов конструктора с одним аргументом класса A
        System.out.println("Конструктор с одним аргументом класса B");
    }
}
