public class Main {
    public static void main(String[] args) {
        LightTransport lightTransport = new LightTransport(160, 220, 2500, "BMW", 4, 8.5f, "sedan", 4);
        System.out.println(lightTransport.powerInKw());
        lightTransport.distanceOfTime(2);
        FreightTransport freightTransport = new FreightTransport(600, 180, 5000, "Scania", 6, 24, 12000);
        freightTransport.possibilityLoad(10000);
        freightTransport.possibilityLoad(10000);
    }
}
