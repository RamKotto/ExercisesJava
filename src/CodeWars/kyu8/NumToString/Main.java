package CodeWars.kyu8.NumToString;

public class Main {

    public static void main(String[] args) {
        String str = numberToString(25);
        System.out.println(str);
        /*
        25
         */
    }

    public static String numberToString(int num) {
        return Integer.toString(num);
    }
}

/*
Интересные варианты решения:

class Kata {
  public static String numberToString(int num) {
    return ""+num;
  }
}

class Kata {
  public static String numberToString(int num) {
    // Return a string of the number here!
    return String.format("%d",num);
  }
}
 */
