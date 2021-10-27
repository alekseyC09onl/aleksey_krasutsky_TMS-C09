public class Main {
    public static void main(String[] args) {
        LightTransport lightTransport = new LightTransport(160, 220, 2500, "BMW", 4, 8.5f, "sedan", 4);
        System.out.println(lightTransport.powerInKw());
        lightTransport.distanceOfTime(2);
        FreightTransport freightTransport = new FreightTransport(600, 180, 5000, "Scania", 6, 24, 12000);
        freightTransport.possibilityLoad(10000);
        freightTransport.possibilityLoad(2001);
        CivilTransport civilTransport = new CivilTransport(1000, 1500, 5000, "Airbus", 50, 1000, 150, true);
        civilTransport.possibilityLoadPassengers(120);
        civilTransport.possibilityLoadPassengers(50);
        MilitaryTransport militaryTransport = new MilitaryTransport(1100, 1600, 4000, "AirBattler", 40, 600, true, 2);
        militaryTransport.shot();
        militaryTransport.shot();
        militaryTransport.shot();
        militaryTransport.bailout();

    }
}
