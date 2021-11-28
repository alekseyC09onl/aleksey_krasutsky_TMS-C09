package com.tms.les17task5;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Task5 {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Александр", "Пушкин"),
                new Person("Петр", "Кузьмин"),
                new Person("Иван", "Дворов"),
                new Person("Петр", "Петров"),
                new Person("Владислав", "Сидоров"),
                new Person("Федор", "Мельников"),
                new Person("Василий", "Добрынин")

        );
        System.out.println(getPersonSurnameBeginOnD(persons));
        printContPersonsForFirstLetter(persons);
    }


    private static Optional<String> getPersonSurnameBeginOnD(List<Person> list) {
        Optional<String> any = list.stream().
                filter(person -> person.getSurName().matches("Д+[а-я]+")).
                map(Person::toString).
                findFirst();
        return any;
    }

    private static void printContPersonsForFirstLetter(List<Person> list) {
        for (int i = 0; i < list.size(); i++) {
            int finalI = i;
            System.out.println(String.valueOf(list.get(i).getSurName().charAt(0)) + " - " +
                    list.stream().
                            filter(person -> person.getSurName().startsWith(String.valueOf(list.get(finalI).getSurName().charAt(0)))).
                            count() + " сотрудника");
        }
    }
}
