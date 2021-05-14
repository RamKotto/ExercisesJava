package Webinars.Generics.OldWayGeneric;

import java.util.ArrayList;
import java.util.List;

public class OldWayGeneric {

    public static void main(String[] args) {
        List strings = new ArrayList();
        strings.add("empty string");
        strings.add("another empty string");
        showStrings(strings);
    }

    public static void showStrings(List strings) {
        for (int i = 0; i <= strings.size() - 1; i++) {
            String str = (String) strings.get(i);
            System.out.println(str.toUpperCase());
        }
    }
}
