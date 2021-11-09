package task1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public class StringFormatterImpl implements StringFormatter {
    String string;

    @Override
    public void cutString(int cutFrom, int cutTo) {
        String str = string.substring(cutFrom, cutTo);
        String stringNew = string.replace(str, "");
        System.out.println(stringNew);
    }

    @Override
    public void changeSymbols(int positionOne, int positionTwo) {

    }

    @Override
    public void getPalindroms(String... words) {

    }

    @Override
    public void getSentences(int countWordsFrom, int countWordsTo) {

    }
}
