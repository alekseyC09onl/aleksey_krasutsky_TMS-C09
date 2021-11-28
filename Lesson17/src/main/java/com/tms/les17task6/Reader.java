package com.tms.les17task6;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor

public class Reader {
    private String fio;
    private EmailAddress emailAddress;
    private boolean agreedForNotification;
    private List<Book> listTakesBooks;
}
