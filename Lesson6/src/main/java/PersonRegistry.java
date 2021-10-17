public class PersonRegistry {
    private static Person[] recruit;
    private static int count;
    //    private int count1;
    private static Person[] futureArmy;

    public PersonRegistry(Person[] recruit) {
        this.recruit = recruit;
    }


    public static Person[] readyToArmy() {
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

    public static void getReadyToArmy() {
        System.out.print("Годны к службе: ");
        for (Person person : readyToArmy()) {
            System.out.print(person.getName() + "; ");
        }
        System.out.println();
    }

    public static int getReadyToArmyFromMinsk() {
        int count1 = 0;
        for (Person person : readyToArmy()) {
            if (person.getCity().equalsIgnoreCase("Минск")) {
                count1++;
            }
        }
        return count1;
    }

    public static int getReadyToArmyFromChooseCity(String city) {
        int count1 = 0;
        for (Person person : readyToArmy()) {
            if (person.getCity().equalsIgnoreCase(city)) {
                count1++;
            }
        }
        return count1;
    }

    public static int getReadyToArmyOldYear() {
        int count1 = 0;
        for (Person person : readyToArmy()) {
            if (person.getAge() >= 25 && person.getAge() < 27) {
                count1++;
            }
        }
        return count1;
    }

    public static int getCountReadyToArmyRangeYearOld(int min, int max) {
        int count1 = 0;
        for (Person person : readyToArmy()) {
            if (person.getAge() >= min && person.getAge() < max) {
                count1++;
            }
        }
        return count1;
    }

    public static int getCountReadyToArmyChooseName(String name) {
        int count1 = 0;
        for (Person person : readyToArmy()) {
            if (person.getName().equalsIgnoreCase(name)) {
                count1++;
            }
        }
        return count1;
    }
}
