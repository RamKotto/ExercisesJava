package HomeTraining.Collections.ArrayCopy;

import java.util.Arrays;

public class Examples {
    public static void main(String[] args) {
        int[] first = {1, 2, 3, 4, 5};
        int[] second = new int[10];
        // [откуда копируем], [srcPos:0], [куда копируем], [destPos:0], [length:first.length]
        System.arraycopy(first, 0, second, 0, first.length);
        System.out.println(Arrays.toString(second));    // [1, 2, 3, 4, 5, 0, 0, 0, 0, 0]

        int[] third = new int[10];
        System.arraycopy(first, 0, third, 0, 3);
        System.out.println(Arrays.toString(third));    // [1, 2, 3, 0, 0, 0, 0, 0, 0, 0]

        System.arraycopy(first, 2, third, 5, 2);
        System.out.println(Arrays.toString(third));    // [1, 2, 3, 0, 0, 3, 4, 0, 0, 0]
    }
}
