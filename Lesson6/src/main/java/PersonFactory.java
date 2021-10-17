import java.util.Scanner;

public class PersonFactory {
    private Scanner consoleInt = new Scanner(System.in);
    private Scanner consoleLine = new Scanner(System.in);
    private static int count;
    private Person[] recruit;
    String name;
    int age;
    int sex1;
    String sex;
    String country;
    String city;


    public Person[] createPerson() {
        System.out.println("Введите количество новобранцев: ");
        while (true) {
            while (!consoleInt.hasNextInt()) {
                System.out.println("Ошибка при вводе, введите количество новобранцев: ");
                consoleInt.next();
            }
            count = consoleInt.nextInt();
            if (count > 0) {
                break;
            } else {
                System.out.println("Ошибка при вводе, число должно быть больше нуля: ");
            }
        }
        recruit = new Person[count];
        for (int i = 0; i < recruit.length; i++) {
            System.out.println("Необходимо заполнить данные " + (i + 1) + "-го новобранца!");
            System.out.println("Введите имя:");
            name = consoleLine.nextLine();
            System.out.println("Введите возраст:");
            while (true) {
                while (!consoleInt.hasNextInt()) {
                    System.out.println("Ошибка при вводе, введите возраст еще раз: ");
                    consoleInt.next();
                }
                age = consoleInt.nextInt();
                if (age > 0) {
                    break;
                } else {
                    System.out.println("Ошибка при вводе, число должно быть больше нуля: ");
                }
            }
            System.out.println("Выберите пол: \"1\" - мужской, \"2\" - женский.");
            while (true) {
                while (!consoleInt.hasNextInt()) {
                    System.out.println("Ошибка при вводе, повторите попытку: ");
                    consoleInt.next();
                }
                sex1 = consoleInt.nextInt();
                if (sex1 == 1 || sex1 == 2) {
                    if (sex1 == 1) {
                        sex = Person.MALE;
                    } else {
                        sex = Person.FEMALE;
                    }
                    break;
                } else {
                    System.out.println("Ошибка при вводе, число должно быть \"1\" или \"2\": ");
                }

            }
            System.out.println("Введите страну проживания: ");
            country = consoleLine.nextLine();
            System.out.println("Введите город проживания: ");
            city = consoleLine.nextLine();
            recruit[i] = new Person(name, age, sex, country, city);
        }
        return recruit;
    }
}
