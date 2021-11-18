package com.tms.task1;

import lombok.experimental.UtilityClass;

@UtilityClass
public class Helpers {
    public static boolean checkPalindroms(String word) {
        for (int i = 0; i < word.length() / 2; i++) {
            if (!String.valueOf(word.charAt(i)).equalsIgnoreCase(String.valueOf(word.charAt(word.length() - 1 - i)))) {
                return false;
            }
        }
        return true;
    }
}
