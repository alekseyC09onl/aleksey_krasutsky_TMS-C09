package hw5;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Car {
    @JsonCreator
    public Car(@JsonProperty("brand_name") String brand,
               @JsonProperty("max_speed") int maxSpeed,
               @JsonProperty("model_name") String model_name) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    private String brand;

    private int maxSpeed;

    private int price;

    @Override
    public String toString() {
        return "Это автомобиль " +
                "марки " + brand + ". " +
                "Максимальная скорость составляет " + maxSpeed + " км/ч. " +
                "Цена " + price + " $.";
    }
}
