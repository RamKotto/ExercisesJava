package HomeTraining.Classes.Inheritance;

public class Main {
    public static void main(String[] args) {
//        Employee sam = new Employee("Sam", "Microsoft");
//        sam.getInfo();
//        sam.work();
        /*
        Name: Sam
        Sam works in Microsoft
         */

        //  переопределим getInfo() с помощью @Override
        Employee bob = new Employee("Bob", "Чайная ложка");
        bob.getInfo();
        /*
        Name: Bob
        Bob works in Чайная ложка
         */
    }
}

class Person {
    private String name;

    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }

    public void getInfo() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    private String company;

    public Employee(String name, String company) {
        super(name);
        this.company = company;
    }

//    public void work() {
//        System.out.printf("%s works in %s \n", getName(), company);
//    }

    // Сократим класс Employee с помощью переопределения
    @Override
    public void getInfo() {
        System.out.println("Name: " + getName());
        System.out.printf("%s works in %s \n", getName(), company);
    }
}

/*
Запрет наследования
Хотя наследование очень интересный и эффективный механизм,
но в некоторых ситуациях его применение может быть нежелательным.
И в этом случае можно запретить наследование с помощью ключевого слова final.
 */
