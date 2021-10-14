import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String href = "allTests?projectId=12";
        List<String> hrefSeparator = new ArrayList<>(Arrays.asList(href.split("=")));
        System.out.println(hrefSeparator.get(1));

    }


    public String getProjectIdByXpath() {
        String href = "allTests?projectId=12";
        return new ArrayList<>(Arrays.asList(href.split("="))).get(1);
    }
}
