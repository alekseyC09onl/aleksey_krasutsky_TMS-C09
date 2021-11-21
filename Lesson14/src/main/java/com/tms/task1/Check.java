package com.tms.task1;

import lombok.Getter;
import lombok.Setter;

import java.io.*;

@Getter
@Setter
public class Check implements Checkable {

    @Override
    public void checkPalindromsInFile(String checkedFile, String resultFile) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(checkedFile))) {
            String i;
            while ((i = bufferedReader.readLine()) != null) {
                if (Helpers.checkPalindroms(i)) {
                    System.out.println(i);
                    try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(resultFile, true))) {
                        bufferedWriter.write(i + "\n");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
