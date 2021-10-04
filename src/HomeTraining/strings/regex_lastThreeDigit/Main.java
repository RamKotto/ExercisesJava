package HomeTraining.strings.regex_lastThreeDigit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String inputString = "36748943_987";;
        String pattern = "\\d{3}$";

        Pattern ptrn = Pattern.compile(pattern);
        Matcher matcher = ptrn.matcher(inputString);

        if(matcher.find()){
            System.out.println("For Masha, with love:" + matcher.group(0));
        }else {
            System.out.println("Something went wrong. Maybe because I love Masha...");
        }
    }
}
