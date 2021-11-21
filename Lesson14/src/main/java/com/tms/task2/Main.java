package com.tms.task2;

import com.tms.task1.Helpers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import static com.tms.task2.Constants.INPUT_FILE;
import static com.tms.task2.Constants.OUTPUT_FILE;

public class Main {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        String[] sentences = Helpers.getTextFromFile(INPUT_FILE).split("[.!?]\\s*");
        for (int i = 0; i < sentences.length; i++) {
            if ((TextFormatter.getCountOfWords(sentences[i]) >= 3) && (TextFormatter.getCountOfWords(sentences[i]) <= 5)) {
                result.append(sentences[i] + "\n");
            } else if (TextFormatter.hasPalindroms(sentences[i])) {
                result.append(sentences[i] + "\n");
            }
        }
        writeResult(result);
    }


    private static void writeResult(StringBuilder result) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(OUTPUT_FILE, true))) {
            bufferedWriter.write(result.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
