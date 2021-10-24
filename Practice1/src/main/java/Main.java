public class Main {
    public static void main(String[] args) {
        Phone xiaomi = new Phone(375291111111L, "Xiaomi", 0.220f);
        Phone iPhone = new Phone(375292222222L, "IPhone", 0.240f);
        xiaomi.getNumber();
        xiaomi.receiveCall("Google");
        xiaomi.sendMessage(375293333333L, 375294444444L, 375295555555L);
        xiaomi.toString();
    }

}
