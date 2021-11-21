package com.tms.task2;


import com.tms.task1.Helpers;

public class TextFormatter {
    public static int getCountOfWords(String sentence) {
        String[] words = sentence.split("\\s+");
        return words.length;
    }

    public static boolean hasPalindroms(String sentence) {
        String[] words = sentence.split("\\s+");
        for (String word : words) {
            if (Helpers.checkPalindroms(word)) {
                return true;
            }
        }
        return false;
    }
}
