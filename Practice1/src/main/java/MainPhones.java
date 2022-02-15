import java.util.stream.Stream;

public class MainPhones {
    public static void main(String[] args) {
        Stream<Phones> phonesStream = Stream.of(
                new Phones("iPhone 6 S", 54000),
                new Phones("Lumia 950", 45000),
                new Phones("Samsung Galaxy S 6", 40000));

        phonesStream
                .map(p -> "название: " + p.getName() + " цена: " + p.getPrice())
                .forEach(p -> System.out.println(p));
    }
}
