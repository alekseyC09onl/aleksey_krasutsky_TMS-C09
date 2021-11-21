package com.tms.task1;

import lombok.experimental.UtilityClass;

import java.io.FileReader;
import java.nio.charset.StandardCharsets;

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

    public static String getTextFromFile(String pathToFile) {
        StringBuilder stringBuilder = new StringBuilder();
        try (FileReader fileReader = new FileReader(pathToFile, StandardCharsets.UTF_8)) {
            int c;
            while ((c = fileReader.read()) != -1) {
                stringBuilder.append((char) c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }
}
