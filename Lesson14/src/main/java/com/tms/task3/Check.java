package com.tms.task3;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Check implements Checkable {
    private int countIncorrectSentences;
    private StringBuilder stringBuilder;
    private byte flag;

    public Check() {
        this.stringBuilder = new StringBuilder();
    }

    @Override
    public void checkText(String text, String blackList) {
        String[] sentences = text.split("[.!?]\\s*");
        String[] blackWords = blackList.split("[,.]\\s*");
        for (int i = 0; i < sentences.length; i++) {
            String[] words = sentences[i].split("\\s+");
            for (int j = 0; j < blackWords.length; j++) {
                for (String word : words) {
                    if (word.equalsIgnoreCase(blackWords[j])) {
                        flag++;
                        stringBuilder.append(sentences[i] + "\n");
                        break;
                    }
                }
            }
        }
    }

    @Override
    public void getCheckInfo() {
        if (flag > 0) {
            System.out.println("Текст не прошел проверку на цензуру. Предложений с запрещенными словами: " + flag);
            System.out.println(stringBuilder.toString());
        } else {
            System.out.println("Текст успешно прошел проверку на цензуру!");
        }
    }
}
