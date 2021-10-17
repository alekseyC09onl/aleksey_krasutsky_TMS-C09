public class PersonRegistry {
    private static Person[] recruit;
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
}
