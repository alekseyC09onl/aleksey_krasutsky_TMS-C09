package com.tms.task1.input;

import java.io.IOException;

public interface Reader {
    String readLine() throws IOException;

    byte[] readAll() throws IOException;

}
