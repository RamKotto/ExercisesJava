package CodeWars.DuplicateEncoder6kyu;

/*
The goal of this exercise is to convert a string to a new string
where each character in the new string is "(" if that character appears only once in the original string,
or ")" if that character appears more than once in the original string.
Ignore capitalization when determining if a character is a duplicate.
 */


import java.util.*;

public class DuplicateEncoder {
    public static void main(String[] args) {
        System.out.println(encode("Apple"));
    }

    static String encode(String word){
        // Превращаем слово в массив букв:
        String[] letterArray = word.toLowerCase().split("");
        System.out.println(Arrays.asList(letterArray));

        // Уникальные буквы в слове:
        Set<String> uniqueLetter = new TreeSet<>(Arrays.asList(letterArray));

        // Считаем, сколько раз встречается каждая буква:
        Map<String, Integer> countOfLetter = new HashMap<>();
        for (String i : uniqueLetter) {
            countOfLetter.put(i, Collections.frequency(Arrays.asList(letterArray), i));
        }

        // Конвертируем буквы в скобки:
        StringBuilder newWord = new StringBuilder();
        for (String i : letterArray) {
            if (countOfLetter.get(i) > 1) {
                newWord.append(")");
            } else {
                newWord.append("(");
            }
        }
        word = newWord.toString();

        return word;
    }
}


/*
Shorter solution:
public class DuplicateEncoder {
  static String encode(String word){
    word = word.toLowerCase();
    String result = "";
    for (int i = 0; i < word.length(); ++i) {
      char c = word.charAt(i);
      result += word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")";
    }
    return result;
  }
}
 */
