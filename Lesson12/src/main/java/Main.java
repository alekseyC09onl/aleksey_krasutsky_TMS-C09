import task1.StringFormatter;
import task1.StringFormatterImpl;

public class Main {
    public static void main(String[] args) {
        StringFormatter stringFormatter = new StringFormatterImpl();
        stringFormatter.cutString("v", "o", "gravitation");
        System.out.println("------");
        stringFormatter.changeSymbols(3, 0, "electricity");
        System.out.println("------");
        String[] strings = {"шалаш", "казак", "палиндром", "дед", "программа"};
        stringFormatter.getPalindroms(strings);
        System.out.println("------");
        stringFormatter.getSentencesWithCountWords("Резко пошел дождь. Дети старались быстрее найти укрытие от него. Если бы не шалаш рядом все бы промокли. Все обошлось. Всех спас шалаш.", 3, 5);
    }
}
