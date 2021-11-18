package com.tms.task1.input;

import lombok.Getter;
import lombok.Setter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

@Getter
@Setter
public class ReaderImpl implements Reader {
    private String inputFilePath;
    private FileReader reader;
    private boolean closed = false;

    public ReaderImpl(String inputFilePath) throws FileNotFoundException {
        this.inputFilePath = inputFilePath;
        reader = new FileReader(inputFilePath);
    }

    @Override
    public String readLine() throws IOException {
        if (closed) {
            return null;
        }
        int i;
        StringBuilder stringBuilder = new StringBuilder();
        while ((i = reader.read()) != -1 && i != 10) {
            stringBuilder.append((char) i);
        }
        if (i == -1) {
            reader.close();
            closed = true;
        }
        return stringBuilder.toString();
    }

    @Override
    public byte[] readAll() throws IOException {
        try (FileReader fileReader = new FileReader(inputFilePath)) {
            int i;
            StringBuilder stringBuilder = new StringBuilder();
            char[] buffer = new char[32];
            while ((i = fileReader.read()) > -1) {
                if (i < 32) {
                    buffer = Arrays.copyOf(buffer, i);
                }
                stringBuilder.append(buffer);
            }
            return stringBuilder.toString().getBytes();
        }
    }
}
