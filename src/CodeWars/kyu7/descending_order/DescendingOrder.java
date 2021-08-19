package CodeWars.kyu7.descending_order;

import java.util.Arrays;

public class DescendingOrder {
    public static void main(String[] args) {
        int num = sortDesc(1429832);
        System.out.println(num);    // 9843221
    }

    public static int sortDesc(final int num) {
        return strArrayToInt(Arrays.toString(sortedIntArrayToDesc(intToArray(num))));
    }

    public static int[] intToArray(int num) {
        int[] intArray = new int[Integer.toString(num).length()];
        String[] strArr = Integer.toString(num).split("");
        for (int i = 0; i < strArr.length; i++) {
            intArray[i] = Integer.parseInt(strArr[i]);
        }
        return intArray;
    }

    // Алгоритмы в действии =)
    public static int[] sortedIntArrayToDesc(int[] arr) {
        boolean isSorted = false;
        int tmp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i+1]) {
                    isSorted = false;
                    tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i + 1] = tmp;
                }
            }
        }
        return arr;
    }

    public static int strArrayToInt(String str) {
        return Integer.parseInt(str
                .replace(",", "")
                .replace(" ", "")
                .replace("[", "")
                .replace("]", ""));
    }
}

/*
===========================================================================================================
import java.util.Comparator;
import java.util.stream.Collectors;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        return Integer.parseInt(String.valueOf(num)
                                      .chars()
                                      .mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
                                      .sorted(Comparator.reverseOrder())
                                      .collect(Collectors.joining()));
    }
}

===========================================================================================================
import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        String[] array = String.valueOf(num).split("");
        Arrays.sort(array, Collections.reverseOrder());
        return Integer.valueOf(String.join("", array));
    }
}


 */
