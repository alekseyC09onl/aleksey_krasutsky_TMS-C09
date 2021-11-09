package task1;

public interface StringFormatter {

    void cutString(int cutFrom, int cutTo);

    void changeSymbols(int positionOne, int positionTwo);

    void getPalindroms(String... words);

    void getSentences(int countWordsFrom, int countWordsTo);


}
