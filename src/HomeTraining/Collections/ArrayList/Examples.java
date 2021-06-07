package HomeTraining.Collections.ArrayList;

import java.util.ArrayList;

public class Examples {

    public static void main(String[] args) {
        // [initialCapacity:5]
        ArrayList<Integer> som_dynamic = new ArrayList<>(5);
        som_dynamic.add(1);
        som_dynamic.add(2);
        som_dynamic.add(3);
        som_dynamic.add(22);
        som_dynamic.add(10);
        System.out.println(som_dynamic);    // [1, 2, 3, 22, 10]
        System.out.println(som_dynamic.get(0));    // 1

        // index:2
        som_dynamic.remove(2);
        System.out.println(som_dynamic);    // [1, 2, 22, 10]

        for (Integer i : som_dynamic) {
            System.out.print(i + " ");    // 1 2 22 10
        }
    }

}
