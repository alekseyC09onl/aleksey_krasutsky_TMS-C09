package com.tms.task2;

import static com.tms.task2.Constants.INPUT_FILE;
import static com.tms.task2.Constants.OUTPUT_FILE;

public class Main {
    public static void main(String[] args) {
        Formatter formatter = new FormatterImpl();
        formatter.writeSortedSentencesToFile(formatter.getTextFromFile(INPUT_FILE), OUTPUT_FILE);
    }
}
