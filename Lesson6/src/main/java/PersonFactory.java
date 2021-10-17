import java.util.Scanner;

public class PersonFactory {
    private Scanner console = new Scanner(System.in);
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
            while (!console.hasNextInt()) {
                System.out.println("Ошибка при вводе, введите количество новобранцев: ");
                console.next();
            }
            count = console.nextInt();
            if (count > 0) {
                break;
            } else {
                System.out.println("Ошибка при вводе, число должно быть больше нуля: ");
            }
        }
        recruit = new Person[count];
        for (int i = 0; i < recruit.length; i++) {
            System.out.println("Необходимо заполнить данные " + (i + 1) + "-го новобранца!");
            System.out.println("Введите имя: ");
            name = console.next();
            System.out.println("Введите возраст: ");
            while (true) {
                while (!console.hasNextInt()) {
                    System.out.println("Ошибка при вводе, введите возраст еще раз: ");
                    console.next();
                }
                age = console.nextInt();
                if (age > 0) {
                    break;
                } else {
                    System.out.println("Ошибка при вводе, число должно быть больше нуля: ");
                }
            }
            System.out.println("Выберите пол: \"1\" - мужской, \"2\" - женский.");
            while (true) {
                while (!console.hasNextInt()) {
                    System.out.println("Ошибка при вводе, повторите попытку: ");
                    console.next();
                }
                sex1 = console.nextInt();
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
            country = console.next();
            System.out.println("Введите город проживания: ");
            city = console.next();
            recruit[i] = new Person(name, age, sex, country, city);
        }
        return recruit;
    }
}
