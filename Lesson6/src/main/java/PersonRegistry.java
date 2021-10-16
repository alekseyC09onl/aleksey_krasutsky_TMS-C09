import java.util.Arrays;

public class PersonRegistry {
    public static Person[] recruit;
    private static int count;
    private static Person[] futureArmy;
    private static int count1;
    Person person;

    public PersonRegistry(Person[] recruit) {
        this.recruit = recruit;
    }

    static Person[] readyToArmy(Person[] recruit) {
        for (Person person : recruit) {
            if (person.getGender().equalsIgnoreCase(Person.MALE)) {
                if (person.getAge() >= 18 && person.getAge() < 27) {
                    count++;
                }
            }
        }
        futureArmy = new Person[count];
        count = 0;
        for (Person person : recruit) {
            if (person.getGender().equalsIgnoreCase(Person.MALE)) {
                if (person.getAge() >= 18 && person.getAge() < 27) {
                    futureArmy[count] = person;
                    count++;
                }
            }
        }
        return futureArmy;
    }

    public static void getReadyToArmy(Person[] recruit) {
        for (Person person : recruit) {
            if (person.getGender().equalsIgnoreCase(Person.MALE)) {
                if (person.getAge() >= 18 && person.getAge() < 27) {
                    System.out.println(person.getName() + " - годен");
                } else {
                    System.out.println("не годен по возрасту");
                }
            } else {
                System.out.println("не годен по полу");
            }
        }
//        for (Person person : readyToArmy(recruit)) {
//            System.out.println(person.getName() + " - годен");
//        }
    }

    public static int getReadyToArmyFromMinsk(Person[] recruit) {
        for (Person person : recruit) {
            if (person.getGender().equalsIgnoreCase(Person.MALE)) {
                if (person.getAge() >= 18 && person.getAge() < 27) {
                    if (person.getCity().equalsIgnoreCase("minsk")) {
                        count++;
                    }
                }
            }
        }
        return count;
//        for (Person person : readyToArmy(recruit)) {
//            if (person.getCity().equalsIgnoreCase("minsk")) {
//                count1++;
//            }
//        }
//        return count1;
    }

    @Override
    public String toString() {
        return "PersonRegistry{" +
                "arrayPerson=" + Arrays.toString(recruit) +
                '}';
    }
}
