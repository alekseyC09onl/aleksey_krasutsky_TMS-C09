package task1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Shop {
    private CashBox[] arrayCashBox;

    public Shop() {
        this.arrayCashBox = new CashBox[10];
        for (int i = 0; i < this.arrayCashBox.length; i++) {
            arrayCashBox[i] = new CashBox();
        }
    }
}
