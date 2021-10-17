import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        boolean exit = false;
        Scanner consoleLine = new Scanner(System.in);
        Scanner consoleInt = new Scanner(System.in);
        String name;
        int age;
        int sex1;
        String sex;
        String country;
        String city;
        int count;
        Person[] recruit;

//        Person alex = new Person("Alex", 24, "MALE", "Belarus", "Minsk");
//        Person pavel = new Person("Pavel", 24, "MALE", "Russia", "Moskov");
//        Person alina = new Person("Alina", 24, "FEMALE", "Belarus", "Minsk");
//        Person vova = new Person("Vova", 30, "MALE", "Belarus", "Minsk");
//        Person gena = new Person("Gena", 26, Person.MALE, "Belarus", "MINSK");
//        Person aleksandr = new Person("Aleksandr", 26, Person.MALE, "Belarus", "Brest");
//        Person[] recruit = {alex, pavel, alina, vova, gena, aleksandr};
//        PersonRegistry.getReadyToArmy(recruit);
//        System.out.println("Годны к службе из Минска: " + PersonRegistry.getReadyToArmyFromMinsk(recruit));
//        System.out.println("Годны к службе в возрасте от 25 до 27: " + PersonRegistry.getReadyToArmyOldYear(recruit));
//        System.out.println("Количество Александров, годных к службе: " + PersonRegistry.getReadyToArmyAleksandr(recruit));


        System.out.println("Введите количество новобранцев: ");
        while (!consoleInt.hasNextInt()) {
            System.out.println("Ошибка при вводе, введите количество новобранцев: ");
            consoleInt.next();
        }
        count = consoleInt.nextInt();
        recruit = new Person[count];
        for (int i = 0; i < recruit.length; i++) {
            System.out.println("Необходимо заполнить данные " + (i + 1) + "-го новобранца!");
            System.out.println("Введите имя:");
            while (!consoleLine.hasNextLine()) {
                System.out.println("Ошибка при вводе, введите имя еще раз!");
                consoleLine.next();
            }
            name = consoleLine.nextLine();
            System.out.println("Введите возраст:");
            while (!consoleInt.hasNextInt()) {
                System.out.println("Ошибка при вводе, введите возраст еще раз: ");
                consoleInt.next();
            }
            age = consoleInt.nextInt();
            System.out.println("Выберите пол: \"1\" - мужской, \"2\" - женский.");
            while (!consoleInt.hasNextInt()) {
                System.out.println("Ошибка при вводе, повторите попытку: ");
                consoleInt.next();
            }
            sex1 = consoleInt.nextInt();
            if (sex1 == 1) {
                sex = Person.MALE;
            } else {
                sex = Person.FEMALE;
            }
            System.out.println("Введите страну проживания: ");
            while (!consoleLine.hasNextLine()) {
                System.out.println("Ошибка при вводе, введите страну еще раз!");
                consoleLine.next();
            }
            country = consoleLine.nextLine();
            System.out.println("Введите город проживания: ");
            while (!consoleLine.hasNextLine()) {
                System.out.println("Ошибка при вводе, введите город еще раз!");
                consoleLine.next();
            }
            city = consoleLine.nextLine();
            recruit[i] = new Person(name, age, sex, country, city);
        }
        System.out.println(Arrays.toString(recruit));

        PersonRegistry personRegistry = new PersonRegistry(recruit);
        MilitaryOffice militaryOffice = new MilitaryOffice(PersonRegistry.readyToArmy(recruit));
        MilitaryOffice.getReadyToArmy(MilitaryOffice.personRegistry);
        System.out.println("Годны к службе из Минска: " + MilitaryOffice.getReadyToArmyFromMinsk(MilitaryOffice.personRegistry));
        System.out.println("Годны к службе в возрасте от 25 до 27: " + MilitaryOffice.getReadyToArmyOldYear(MilitaryOffice.personRegistry));
        System.out.println("Количество Александров, годных к службе: " + MilitaryOffice.getReadyToArmyAleksandr(MilitaryOffice.personRegistry));
    }
}
