package com.tms.task2;

import com.tms.task1.Helpers;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FormatterImpl implements Formatter {

    @Override
    public void writeSortedSentencesToFile(String text, String resultFile) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] sentences = text.split("[.!?]\\s+");
        for (int i = 0; i < sentences.length; i++) {
            String[] words = sentences[i].split("\\s+");
            if ((words.length >= 3) && (words.length <= 5)) {
                stringBuilder.append(sentences[i] + "\n");
            } else {
                for (String word : words) {
                    if (Helpers.checkPalindroms(word)) {
                        stringBuilder.append(sentences[i] + "\n");
                        break;
                    }
                }
            }
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(resultFile, true))) {
            bufferedWriter.write(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getTextFromFile(String pathToFile) {
        StringBuilder stringBuilder = new StringBuilder();
        try (FileReader fileReader = new FileReader(pathToFile, StandardCharsets.UTF_8);) {
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
