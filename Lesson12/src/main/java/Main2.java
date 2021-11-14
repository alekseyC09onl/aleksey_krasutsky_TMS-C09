import task2.TextFormatter;
import task2.TextFormatterImpl;

public class Main2 {
    public static void main(String[] args) {
        String text = "Резко пошел дождь. Дети старались быстрее найти укрытие от него. Если бы не шалаш рядом все бы промокли. Все обошлось. Шалаш всех спас. ";
        String[] sentences = text.split("[.]\s");
        TextFormatter textFormatter = new TextFormatterImpl();
        for (String sentence : sentences) {
            System.out.println(textFormatter.getCountOfWords(sentence));
        }
        for (int i = 0; i < sentences.length; i++) {
            System.out.println(sentences[i]);
            System.out.println(textFormatter.checkPalindromsInSentence(sentences[i]));
            System.out.println("---------");
        }
    }
}
