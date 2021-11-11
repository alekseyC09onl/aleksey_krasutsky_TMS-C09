import task1.StringFormatter;
import task1.StringFormatterImpl;

public class Main {
    public static void main(String[] args) {
        StringFormatter stringFormatter = new StringFormatterImpl();
        stringFormatter.cutString("v", "o", "gravitation");
        System.out.println("------");
        stringFormatter.changeSymbols(3, 0, "electricity");
        System.out.println("------");
        String[] strings = {"шалаш", "казак", "полиндром", "дед", "программа"};
        stringFormatter.getPalindroms(strings);

    }
}
