public class PersonRegistry {
    public static Person[] recruit;
    private static int count;
    private static Person[] futureArmy;

    public PersonRegistry(Person[] recruit) {
        this.recruit = recruit;
    }

    static Person[] readyToArmy(Person[] recruit) {
        count = 0;
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
        count = 0;
        return futureArmy;
    }

    public static void getReadyToArmy(Person[] recruit) {
        for (Person person : readyToArmy(recruit)) {
            System.out.println(person.getName() + " - годен");
        }
    }

    public static int getReadyToArmyFromMinsk(Person[] recruit) {
        for (Person person : readyToArmy(recruit)) {
            if (person.getCity().equalsIgnoreCase("minsk")) {
                count++;
            }
        }
        return count;
    }

    public static int getReadyToArmyOldYear(Person[] recruit) {
        for (Person person : readyToArmy(recruit)) {
            if (person.getAge() >= 25 && person.getAge() < 27) {
                count++;
            }
        }
        return count;
    }

    public static int getReadyToArmyAleksandr(Person[] recruit) {
        for (Person person : readyToArmy(recruit)) {
            if (person.getName().equalsIgnoreCase("Aleksandr")) {
                count++;
            }
        }
        return count;
    }


}
