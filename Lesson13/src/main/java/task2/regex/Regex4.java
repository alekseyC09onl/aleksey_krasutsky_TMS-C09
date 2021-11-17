package task2.regex;

public class Regex4 {
    public static void main(String[] args) {
        System.out.println(validate("abcsjf15sk1551ssjd11"));

    }

    public static boolean validate(String str) {
        if (str.matches("[a-z[15]]{4,20}")) {
            return true;
        }
        return false;
    }
}
