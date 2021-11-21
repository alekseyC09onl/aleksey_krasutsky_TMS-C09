package com.tms.task3;


import com.tms.task1.Helpers;

import static com.tms.task3.Constants.BLACK_LIST;
import static com.tms.task3.Constants.INPUT_FILE;

public class Main {
    public static void main(String[] args) {
        Check check = new Check();
        check.checkText(Helpers.getTextFromFile(INPUT_FILE), Helpers.getTextFromFile(BLACK_LIST));
        check.getCheckInfo();
    }
}
