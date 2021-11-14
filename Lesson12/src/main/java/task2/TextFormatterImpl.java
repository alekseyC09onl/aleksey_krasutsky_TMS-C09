package task2;

import static task1.Helpers.checkPalindroms;

public class TextFormatterImpl implements TextFormatter {
    @Override
    public int getCountOfWords(String string) {
        String[] words = string.split("\s");
        return words.length;
    }

    @Override
    public boolean checkPalindromsInSentence(String string) {
        String[] words = string.split("\s");
        for (String word : words) {
            if (checkPalindroms(word)) {
                return true;
            }
        }
        return false;
    }
}
