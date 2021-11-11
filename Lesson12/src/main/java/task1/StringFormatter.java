package task1;

public interface StringFormatter {

    void cutString(String fromSymbol, String toSymbol, String string);

    void changeSymbols(int positionOne, int positionTwo, String string);

    void getPalindroms(String... words);

    void getSentences(int countWordsFrom, int countWordsTo);


}
