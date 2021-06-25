package CodeWars.kyu7.ToJadenCase;

public class Main {

    public static void main(String[] args) throws NullPointerException{
        String str = toJadenCase("hello world");
        System.out.println(str);
    }

    // Метод возвращает строку, в которой все слова начинаются с заглавной буквы
    public static String toJadenCase(String phrase) {
        if (phrase != null && !phrase.isEmpty()) {
            String[] phArray = phrase.split(" ");
            String tmp = "";
            String result = "";
            for (String word : phArray) {
                tmp += (word.substring(0, 1).toUpperCase() + word.substring(1, word.length()) + " ");
            }
            result = tmp.trim();
            return result;
        }
        return null;
    }
}

/*
Интересные решения:
======================================================================
  public String toJadenCase(String phrase) {
    if(phrase == null || phrase.equals("")) return null;

    char[] array = phrase.toCharArray();

    for(int x = 0; x < array.length; x++) {
      if(x == 0 || array[x-1] == ' ') {
        array[x] = Character.toUpperCase(array[x]);
      }
    }

    return new String(array);
  }

======================================================================
    public String toJadenCase(String phrase) {
      if (null == phrase || phrase.length() == 0) {
          return null;
      }

      return Arrays.stream(phrase.split(" "))
                   .map(i -> i.substring(0, 1).toUpperCase() + i.substring(1, i.length()))
                   .collect(Collectors.joining(" "));
  }

 */
