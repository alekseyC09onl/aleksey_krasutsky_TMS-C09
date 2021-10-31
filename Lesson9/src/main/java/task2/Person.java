package task2;

public class Person {
    private String name;
    private IJacket iJacket;
    private ITrousers iTrousers;
    private IShoes iShoes;

    public Person(String name, IJacket iJacket, ITrousers iTrousers, IShoes iShoes) {
        this.name = name;
        this.iJacket = iJacket;
        this.iTrousers = iTrousers;
        this.iShoes = iShoes;
    }

    void putON() {
        iJacket.putON();
        iTrousers.putON();
        iShoes.putON();
    }

    void takeOff() {
        iJacket.takeOff();
        iTrousers.takeOff();
        iShoes.takeOff();
    }
}
