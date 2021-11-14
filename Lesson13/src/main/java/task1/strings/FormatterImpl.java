package task1.strings;

public class FormatterImpl implements Formatter {
    @Override
    public void returnAverageSymbols(String string) {
        System.out.println(string.substring(string.length() / 2 - 1, string.length() / 2 + 1));
    }
}
