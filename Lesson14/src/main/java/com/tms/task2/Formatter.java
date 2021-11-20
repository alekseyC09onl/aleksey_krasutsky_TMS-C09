package com.tms.task2;

public interface Formatter {
    String getTextFromFile(String pathToFile);

    void writeSortedSentencesToFile(String text, String resultFile);

}
