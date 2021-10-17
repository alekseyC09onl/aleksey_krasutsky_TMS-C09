public class MilitaryOffice {
    static Person[] personRegistry;
    private static int count;

    public MilitaryOffice(Person[] personRegistry) {
        this.personRegistry = personRegistry;
    }

    public static void getReadyToArmy(Person[] recruit) {
        System.out.print("Годны к службе: ");
        for (Person person : personRegistry) {
            System.out.print(person.getName() + "; ");
        }
        System.out.println();
    }

    public static int getReadyToArmyFromMinsk(Person[] recruit) {
        for (Person person : personRegistry) {
            if (person.getCity().equalsIgnoreCase("Минск")) {
                count++;
            }
        }
        return count;
    }

    public static int getReadyToArmyOldYear(Person[] recruit) {
        count = 0;
        for (Person person : personRegistry) {
            if (person.getAge() >= 25 && person.getAge() < 27) {
                count++;
            }
        }
        return count;
    }

    public static int getReadyToArmyAleksandr(Person[] recruit) {
        count = 0;
        for (Person person : personRegistry) {
            if (person.getName().equalsIgnoreCase("Александр")) {
                count++;
            }
        }
        return count;
    }
}
