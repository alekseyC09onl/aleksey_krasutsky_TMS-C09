import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class FuelTank {
    private int volumeFuelTank;

    public FuelTank(int volumeFuelTank) {
        this.volumeFuelTank = volumeFuelTank;
    }
}
