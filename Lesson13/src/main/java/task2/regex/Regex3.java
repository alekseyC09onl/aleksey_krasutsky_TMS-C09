package task2.regex;

public class Regex3 {
    public static void main(String[] args) {
        String str = "One two three раз два три one1 two2 123 ";
        System.out.println(str.split("[a-zA-Z]+\s").length - 1);
    }
}
