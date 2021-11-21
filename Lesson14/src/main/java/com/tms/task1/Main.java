package com.tms.task1;


import static com.tms.task1.Constants.INPUT_FILE;
import static com.tms.task1.Constants.OUTPUT_FILE;

public class Main {
    public static void main(String[] args) {
        Checkable check = new Check();
        check.checkPalindromsInFile(INPUT_FILE, OUTPUT_FILE);
    }
}
