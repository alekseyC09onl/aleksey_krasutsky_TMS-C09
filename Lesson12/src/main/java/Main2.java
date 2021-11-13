import task2.TextFormatter;
import task2.TextFormatterImpl;

public class Main2 {
    public static void main(String[] args) {
        String text = "Резко пошел дождь. Дети старались быстрее найти укрытие от него. Если бы не шалаш рядом все бы промокли. Все обошлось. Всех спас шалаш.";
        String[] sentences = text.split("[.]");
        TextFormatter textFormatter = new TextFormatterImpl();
        for (String sentence : sentences) {
            System.out.println(textFormatter.getCountOfWords(sentence));
        }
        for (String sentence : sentences) {
            System.out.println(textFormatter.checkPalindromsInSentence(sentence));
        }
    }
}
