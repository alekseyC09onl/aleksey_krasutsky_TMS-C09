package task1;

import lombok.Getter;
import lombok.Setter;


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
            if (new StringBuilder(word).toString().equals(new StringBuilder(word).reverse().toString())) {
                System.out.println(word);
            }
        }
    }

    @Override
    public void getSentences(int countWordsFrom, int countWordsTo) {

    }
}
