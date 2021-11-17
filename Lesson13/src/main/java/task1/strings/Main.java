package task1.strings;

public class Main {
    public static void main(String[] args) {
        Formatter formatter = new FormatterImpl();
        formatter.getAverageSymbols("корова");
        formatter.getAverageSymbols("string");
        formatter.getAverageSymbols("рама");
    }
}
