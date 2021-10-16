public class Main {
    public static void main(String[] args) {
        Person alex = new Person("Alex", 24, "MALE", "Belarus", "Minsk");
//        System.out.println(alex);
        Person pavel = new Person("Pavel", 24, "MALE", "Russia", "Moskov");
        Person alina = new Person("Alina", 24, "FEMALE", "Belarus", "Minsk");
        Person vova = new Person("Vova", 30, "MALE", "Belarus", "Minsk");
        Person gena = new Person("Gena", 26, Person.MALE, "Belarus", "MINSK");
        Person[] recruit = {alex, pavel, alina, vova};
//        PersonRegistry = new PersonRegistry(recruit);
        PersonRegistry.getReadyToArmy(recruit);
        System.out.println("Годны к службе из Минска: " + PersonRegistry.getReadyToArmyFromMinsk(recruit));
//        PersonRegistry.getReadyToArmyFromMinsk(recruit);
//        System.out.println(personRegistry);
//        MilitaryOffice militaryOffice = new MilitaryOffice(personRegistry);
    }
}
