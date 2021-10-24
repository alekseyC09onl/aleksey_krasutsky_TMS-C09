public class Phone {
    private long number;
    private String model;
    private float weight;

    public Phone(long number, String model, float weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(long number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, long receiveNumber) {
        System.out.println("Звонит " + name + ", номер - " + receiveNumber);
    }

    public void sendMessage(long... toNumber) {
        for (int i = 0; i < toNumber.length; i++) {
            System.out.println("Сообщение на номер " + toNumber[i]);
        }
    }

    public void getNumber() {
        System.out.println("Номер телефона: " + number);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
