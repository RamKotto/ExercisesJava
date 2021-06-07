package HomeTraining.Collections.LinkedList;

import java.util.LinkedList;

public class Examples {

    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Tom");
        names.add("Mike");
        names.add("John");

        // [index:1], [element:"Alex"]
        names.add(1,"Alex");
        System.out.println(names);    // [Tom, Alex, Mike, John]
        System.out.println(names.getFirst());    // Tom
        System.out.println(names.getLast());    // John
    }
}
