public class MilitaryOffice {

    public MilitaryOffice() {
    }

    public void printReadyToArmy() {
        PersonRegistry.getReadyToArmy();
    }

    public void printReadyToArmyFromMinsk() {
        System.out.println("Годны к службе из Минска: " + PersonRegistry.getReadyToArmyFromChooseCity("минск"));
    }

    public void printReadyToArmyRangeYearOld(int min, int max) {
        System.out.println("Годны к службе в возрасте от " + min + " до " + max + ": " + PersonRegistry.getCountReadyToArmyRangeYearOld(min, max));
    }

    public void printReadyToArmyChooseName(String name) {
        System.out.println("Количество призывников, с именем " + name + ": " + PersonRegistry.getCountReadyToArmyChooseName(name));
    }

}
