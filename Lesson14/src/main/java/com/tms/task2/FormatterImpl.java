package com.tms.task2;

import java.io.FileInputStream;

public class FormatterImpl implements Formatter {
    @Override
    public void chooseSentencesFromFile(String pathToFile) {
        try (FileInputStream fileInputStream = new FileInputStream(pathToFile)) {
            byte[] buffer = new byte[fileInputStream.available()];
            fileInputStream.read(buffer);
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < buffer.length; i++) {
                stringBuilder.append((char) buffer[i]);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
