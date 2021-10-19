public class MilitaryOffice {
    private PersonRegistry personRegistry;

    public MilitaryOffice(PersonRegistry personRegistry) {
        this.personRegistry = personRegistry;
    }


    public void printReadyToArmy() {
        personRegistry.getReadyToArmy();
    }

    public void printReadyToArmyFromMinsk() {
        System.out.println("Годны к службе из Минска: " + personRegistry.getReadyToArmyFromChooseCity("минск"));
    }

    public void printReadyToArmyRangeYearOld(int min, int max) {
        System.out.println("Годны к службе в возрасте от " + min + " до " + max + ": " + personRegistry.getCountReadyToArmyRangeYearOld(min, max));
    }

    public void printReadyToArmyChooseName(String name) {
        System.out.println("Количество призывников, с именем " + name + ": " + personRegistry.getCountReadyToArmyChooseName(name));
    }
}
