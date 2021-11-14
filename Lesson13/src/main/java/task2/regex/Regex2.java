package task2.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("Java\s+\\d{1,2}");
        Matcher matcher = pattern.matcher("Versions: Java  5, Java 6, Java   7, Java 8, Java 12.");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
