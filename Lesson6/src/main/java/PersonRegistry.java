import java.util.Arrays;

public class PersonRegistry {
    public static Person[] arrayPerson = new Person[4];
    Person person;

    public PersonRegistry(Person[] arrayPerson) {
        this.arrayPerson = arrayPerson;
    }

    @Override
    public String toString() {
        return "PersonRegistry{" +
                "arrayPerson=" + Arrays.toString(arrayPerson) +
                '}';
    }
}
