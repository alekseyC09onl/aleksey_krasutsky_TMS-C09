package task1;

import lombok.Getter;
import lombok.Setter;

import static task1.Helpers.checkPalindroms;


@Getter
@Setter

public class StringFormatterImpl implements StringFormatter {


    @Override
    public void cutString(String fromSymbol, String toSymbol, String string) {
        String str = string.substring(string.indexOf(fromSymbol), string.lastIndexOf(toSymbol) + 1);
        System.out.println(string.replace(str, ""));
    }

    @Override
    public void changeSymbols(int positionOne, int positionTwo, String string) {
        char changeIt = string.charAt(positionOne);
        char changeTo = string.charAt(positionTwo);
        System.out.println(string.replace(changeIt, changeTo));
    }

    @Override
    public void getPalindroms(String... words) {
        for (String word : words) {
            if (checkPalindroms(word)) {
                System.out.println(word);
            }
        }
    }

    @Override
    public void getSentencesWithCountWords(String text, int countWordsFrom, int countWordsTo) {
        String[] sentences = text.split("\\.\\s*");
        for (int i = 0; i < sentences.length; i++) {
            String[] words = sentences[i].split("\s");
            if ((words.length >= countWordsFrom && words.length <= countWordsTo)) {
                System.out.println(sentences[i]);
            } else {
                for (String word : words) {
                    if ((checkPalindroms(word))) {
                        System.out.println(sentences[i]);
                    }
                }
            }
        }
    }
}
