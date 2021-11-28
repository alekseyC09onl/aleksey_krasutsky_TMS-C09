package com.tms.les17task6;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor


public class Library {
    private List<Book> bookList;
    private List<Reader> readerList;
}
