package HomeTraining.regex.first;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String correctStr;
        String stringForCut = "Hello Bro From 111 Russsia!";
        String strOfNums = "123-456-789";

        String regex = "^[\\d]{3}|[\\s][\\d]+";
        Matcher matcher = Pattern.compile(regex).matcher(strOfNums);
        while (matcher.find()) {
            correctStr = matcher.group();
            System.out.println(correctStr);  // 123
        }

        matcher = Pattern.compile(regex).matcher(stringForCut);
        while (matcher.find()) {
            correctStr = matcher.group();
            System.out.println(correctStr.trim());  // 111
        }


    }
}
