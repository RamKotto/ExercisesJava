package HomeTraining.Classes.ClassExample;

public class Main {
    public static void main(String[] args) {
//        Person undef = new Person();
//        undef.getInfo();
//
//        Person bob = new Person("Bob");
//        bob.getInfo();
//
//        Person sam  = new Person("Sam", 34);
//        sam.getInfo();

        /*
        Вывод:
        Name: Undefined 	Age: 18
        Name: Bob 	Age: 54
        Name: Sam 	Age: 34
         */


        User undef = new User();
        undef.getInfo();

        User bob = new User("Bob");
        bob.getInfo();

        User sam  = new User("Sam", 34);
        sam.getInfo();

        /*
        Вывод:
        Name: Undefined 	Age: 18
        Name: Bob 	Age: 18
        Name: Sam 	Age: 34
         */
    }
}


//  в этом случае только один класс может иметь модификатор public  (В одном файле больше 1 класса);
class Person {
    String name;
    int age;

    Person() {
        this("Undefined", 18);
    }

    Person(String name) {
        this(name, 54);
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getInfo() {
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}

// инициализаторы
class User {
    String name;
    int age;

    /*начало блока инициализатора*/
    {
        name = "Undefined";
        age = 18;
    }

    User() {

    }

    User(String name) {
        this.name = name;
    }

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getInfo() {
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}
