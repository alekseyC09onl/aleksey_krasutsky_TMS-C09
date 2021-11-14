package task1.strings;

public class Main {
    public static void main(String[] args) {
        Formatter formatter = new FormatterImpl();
        formatter.returnAverageSymbols("корова");
        formatter.returnAverageSymbols("string");
        formatter.returnAverageSymbols("рама");
    }
}
