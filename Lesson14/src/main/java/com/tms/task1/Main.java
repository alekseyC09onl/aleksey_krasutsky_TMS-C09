package com.tms.task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("Lesson14/src/main/java/hw1/input.txt"))) {
            String i;
            while ((i = bufferedReader.readLine()) != null) {
                if (Helpers.checkPalindroms(i)) {
                    System.out.println(i);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
