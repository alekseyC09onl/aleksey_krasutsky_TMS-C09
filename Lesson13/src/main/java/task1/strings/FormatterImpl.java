package task1.strings;

public class FormatterImpl implements Formatter {
    @Override
    public void getAverageSymbols(String string) {
        int i = string.length() / 2;
        System.out.println(string.substring(i - 1, i + 1));
    }
}
