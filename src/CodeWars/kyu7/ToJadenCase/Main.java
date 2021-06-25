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


 */
