public class Main {
    public static void main(String[] args) throws InterruptedException {

//        Person alex = new Person("Алексей", 24, "MALE", "Беларусь", "Минск");
//        Person pavel = new Person("Павел", 24, "MALE", "Россия", "Москва");
//        Person alina = new Person("Алина", 24, "FEMALE", "Беларусь", "Минск");
//        Person vova = new Person("Владимир", 30, "MALE", "Беларусь", "Минск");
//        Person gena = new Person("Геннадий", 26, Person.MALE, "Беларусь", "Минск");
//        Person aleksandr = new Person("Александр", 26, Person.MALE, "Беларусь", "Брест");
//        recruit = new Person[]{alex, pavel, alina, vova, gena, aleksandr};
//        PersonRegistry personRegistry = new PersonRegistry(recruit);
//        MilitaryOffice militaryOffice = new MilitaryOffice();
//        militaryOffice.printReadyToArmy();
//        militaryOffice.printReadyToArmyFromMinsk();
//        militaryOffice.printReadyToArmyRangeYearOld();
//        militaryOffice.printReadyToArmyChooseName();

        PersonFactory personFactory = new PersonFactory();
        PersonRegistry personRegistry = new PersonRegistry(personFactory.createPerson());
        MilitaryOffice militaryOffice = new MilitaryOffice();
        militaryOffice.printReadyToArmy();
        militaryOffice.printReadyToArmyFromMinsk();
        militaryOffice.printReadyToArmyRangeYearOld(25, 27);
        militaryOffice.printReadyToArmyChooseName("Александр");
    }
}
