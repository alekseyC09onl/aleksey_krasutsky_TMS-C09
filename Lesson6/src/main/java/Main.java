public class Main {
    public static void main(String[] args) {
        Person alex = new Person("Alex", 24, "MALE", "Belarus", "Minsk");
        Person pavel = new Person("Pavel", 24, "MALE", "Russia", "Moskov");
        Person alina = new Person("Alina", 24, "FEMALE", "Belarus", "Minsk");
        Person vova = new Person("Vova", 30, "MALE", "Belarus", "Minsk");
        Person gena = new Person("Gena", 26, Person.MALE, "Belarus", "MINSK");
        Person aleksandr = new Person("Aleksandr", 26, Person.MALE, "Belarus", "Brest");
        Person[] recruit = {alex, pavel, alina, vova, gena, aleksandr};
        PersonRegistry.getReadyToArmy(recruit);
        System.out.println("Годны к службе из Минска: " + PersonRegistry.getReadyToArmyFromMinsk(recruit));
        System.out.println("Годны к службе в возрасте от 25 до 27: " + PersonRegistry.getReadyToArmyOldYear(recruit));
        System.out.println("Количество Александров, годных к службе: " + PersonRegistry.getReadyToArmyAleksandr(recruit));
    }
}
