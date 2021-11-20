package com.tms.task2;

import static com.tms.task2.Constants.INPUT_FILE;

public class Main {
    public static void main(String[] args) {
        Formatter formatter = new FormatterImpl();
        formatter.chooseSentencesFromFile(INPUT_FILE);
    }
}
