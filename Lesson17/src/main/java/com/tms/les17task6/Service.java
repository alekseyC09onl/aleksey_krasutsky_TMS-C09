package com.tms.les17task6;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Service {
    private Library library;

    public Service(Library library) {
        this.library = library;
    }

    public void printSortedListBooksSimple() {
        Comparator comparator = new ComparatorYearBook();
        library.getBookList().sort(comparator);
        for (Book book : library.getBookList()) {
            System.out.println(book.toString());
        }
    }

    public void printSortedListBooks() {
        Comparator comparator = new ComparatorYearBook();
        library.getBookList().stream().sorted(comparator).forEach(System.out::println);
    }

    public List<EmailAddress> getListEmails() {
//        List<EmailAddress> eMails = new ArrayList<>();
        List<EmailAddress> collect = library.getReaderList().stream().
                map(n -> n.getEmailAddress()).
                collect(Collectors.toList());
//        return eMails;
        return collect;
    }

    public List<EmailAddress> getListEmailsAgreedToDistribution() {
        List<EmailAddress> collectAgreedToDistribution = library.getReaderList().stream().
                filter(n -> n.isAgreedForNotification()).
                filter(n -> n.getListTakesBooks().size() > 1).
                map(n -> n.getEmailAddress()).
                collect(Collectors.toList());
        return collectAgreedToDistribution;
    }

    public LinkedHashSet<Book> getListAllTakenBooks() {
        LinkedHashSet<Book> linkedHashSet = new LinkedHashSet();
        for (Reader reader : library.getReaderList()) {
            for (Book book : reader.getListTakesBooks()) {
                linkedHashSet.add(book);
            }
        }
        return linkedHashSet;
    }


    public boolean takenPushkinBooks() {
        for (Reader reader : library.getReaderList()) {
            for (Book book : reader.getListTakesBooks()) {
                if (book.getAuthor().equalsIgnoreCase("Пушкин")) {
                    return true;
                }
            }
        }
        return false;
    }
}
