package task1;

public interface StringFormatter {

    void cutString(String fromSymbol, String toSymbol, String string);

    void changeSymbols(int positionOne, int positionTwo, String string);

    void getPalindroms(String... words);

    void getSentencesWithCountWords(String text, int countWordsFrom, int countWordsTo);

}
