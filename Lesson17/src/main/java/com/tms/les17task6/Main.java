package com.tms.les17task6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book boloto = new Book("Пушкин", "болото", 1990);
        Book ozero = new Book("Тургенев", "озеро", 1995);
        Book more = new Book("Котов", "море", 1950);
        Book nebo = new Book("Пушкин", "небо", 1980);
        Book oblako = new Book("Есенин", "облако", 1989);
        Book tucha = new Book("Зайцев", "туча", 1880);
        Reader alex = new Reader("кас", new EmailAddress("mail.ru", "add"), true, new ArrayList<>());
        Reader bob = new Reader("кав", new EmailAddress("gmail", "add"), false, new ArrayList<>());
        ArrayList<Book> bookArrayList = new ArrayList<>();
        bookArrayList.add(boloto);
        bookArrayList.add(ozero);
        bookArrayList.add(more);
        bookArrayList.add(nebo);
        bookArrayList.add(oblako);
        bookArrayList.add(tucha);
        ArrayList<Reader> readerArrayList = new ArrayList<>();
        readerArrayList.add(alex);
        readerArrayList.add(bob);
        Library library = new Library(bookArrayList, readerArrayList);
        alex.getListTakesBooks().add(boloto);
        alex.getListTakesBooks().add(ozero);
        alex.getListTakesBooks().add(more);
        bob.getListTakesBooks().add(nebo);
        bob.getListTakesBooks().add(oblako);
        bob.getListTakesBooks().add(boloto);
        Service service = new Service(library);
        service.printSortedListBooks();
        System.out.println("emails - " + service.getListEmails());
        System.out.println("spam - " + service.getListEmailsAgreedToDistribution());
        System.out.println(service.getListAllTakenBooks());
        System.out.println(service.takenPushkinBooks());
    }
}