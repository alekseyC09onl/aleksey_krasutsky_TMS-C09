package task2.regex;

public class Regex4 {
    public static void main(String[] args) {
        System.out.println(validate("abcsjf15 sk1551ss jd"));

    }

    public static boolean validate(String str) {
        if (str.matches("[a-z[15\s]]+") && (str.length() >= 4 && str.length() <= 20)) {
            return true;
        }
        return false;
    }
}
