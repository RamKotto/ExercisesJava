package CodeWars.kyu7.AnagramDetection;

import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        String test = "Buckethead";
        String original = "DeathCubeK";
        System.out.println(isAnagram(test, original));

    }

    public static boolean isAnagram(String test, String original) {
        byte[] arrTest = test.toLowerCase(Locale.ROOT).getBytes();
        byte[] arrOriginal = original.toLowerCase(Locale.ROOT).getBytes();
        int sumTest = 0;
        int sumOriginal = 0;
        for (int i : arrTest) {
            sumTest += (int) i;
        }
        for (int i : arrOriginal) {
            sumOriginal += (int) i;
        }
        if (sumTest == sumOriginal) {
            return true;
        }
        return false;
    }
}
/*
Other solutions:
==========================================================================================================
  public static boolean isAnagram(String test, String original) {
    if( test == null || original == null || test.length() != original.length())
      return false;

    char ch1 [] = test.toLowerCase().toCharArray();
    char ch2 [] = original.toLowerCase().toCharArray();

    Arrays.sort(ch1);
    Arrays.sort(ch2);

    return Arrays.equals(ch1, ch2);

  }
==========================================================================================================
  public static boolean isAnagram(String test, String original) {
        return Stream.of(test.toLowerCase().split(""))
                .sorted()
                .collect(Collectors.joining())
                .equals(
                        Stream.of(original.toLowerCase()
                                .split(""))
                                .sorted()
                                .collect(Collectors.joining()));

    }
==========================================================================================================
public class Kata {
        public static boolean isAnagram(final String test, final String original) {
            return sortedLowercase(test).equals(sortedLowercase(original));
        }

        private static String sortedLowercase(final String s) {
            return s.toLowerCase()
                    .chars()
                    .sorted()
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();
        }
}
*/