package task2.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("c+ab");
        Matcher matcher = pattern.matcher("cab, ccab, cccab");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
