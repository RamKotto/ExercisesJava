package HomeTraining.strings.regex_replaceAll;


public class Main {
    public static void main(String[] args) {
        String input = "[1, 2, 3, 4, 5, 6]";
        String fixedInput = input.replaceAll("[, \\[\\]]", "");
        System.out.println(fixedInput);
    }
}
