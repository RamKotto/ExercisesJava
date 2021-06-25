package CodeWars.Kyu6.EnoughIsEnough;

import java.util.*;

public class thisIsEnough {

    public static void main(String[] args) {
        deleteNth(new int[] {1, 2, 3, 1, 2, 3, 1, 2, 3}, 2);
        /*
        {1=2, 2=2, 3=2}
        [1, 2, 3, 1, 2, 3]
         */

        deleteNth(new int[] {1, 2, 3, 1, 2, 3, 1, 2, 3}, 1);
        /*
        {1=1, 2=1, 3=1}
        [1, 2, 3]
         */


    }

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        Map<Integer, Integer> arrMap = new HashMap<>();
        for (Integer i : elements) {
            arrMap.put(i, maxOccurrences);
        }
//        System.out.println(arrMap);

        List<Integer> arrList = new ArrayList<>();
        for (Integer i : elements) {
            if (arrMap.get(i) > 0) {
                arrMap.put(i, (arrMap.get(i) - 1));
                arrList.add(i);
            }
        }
//        System.out.println(arrList);

        int[] result = new int[arrList.size()];
        for (int i = 0; i < arrList.size(); i++) {
            result[i] = arrList.get(i);
        }

        return result;
    }

}

/*
Другие интересные решения:
===========================================================================================
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class EnoughIsEnough {
  public static int[] deleteNth(int[] elements, int maxOccurrences) {
    Map<Integer, Integer> occurrence = new HashMap<>();
    return IntStream.of(elements)
      .filter(motif -> occurrence.merge(motif, 1, Integer::sum) <= maxOccurrences)
      .toArray();
  }
}


===========================================================================================
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class EnoughIsEnough {
    private static boolean shouldAdd(final Map<Integer, Integer> counts, final int element, final int maxOccurrences) {
        if (counts.getOrDefault(element, 0) < maxOccurrences) {
            counts.merge(element, 1, Integer::sum);
            return true;
        }
        return false;
    }

    static int[] deleteNth(final int[] elements, final int maxOccurrences) {
        final Map<Integer, Integer> counts = new HashMap<>();
        return Arrays.stream(elements)
            .filter(element -> shouldAdd(counts, element, maxOccurrences))
            .toArray();
    }
}


===========================================================================================
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class EnoughIsEnough {

  public static int[] deleteNth(int[] elements, int maxOccurrences) {
        HashMap<Integer, Integer> map = new HashMap<>();
        return Arrays.stream(elements)
                .filter(element -> map.merge(element, 1, Integer::sum) <= maxOccurrences)
                .toArray();
  }
}
 */
