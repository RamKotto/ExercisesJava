package Webinars.Generics.NewWayGenerics;

import java.util.ArrayList;
import java.util.List;

public class NewWayGenerics {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Empty string");
        strings.add("Another empty string");
        showStrings(strings);
    }

    public static void showStrings(List<String> strings) {
        for (int i = 0; i <= strings.size() - 1; i++) {
            String str = strings.get(i);
            System.out.println(str.toUpperCase());
        }
    }
}
