package task1test;

public enum ProductsEnum {

    MILK("1"),

    MEAT("2"),

    WATER("3"),

    SUGAR("4"),

    SALT("5"),

    BANANA("6"),

    LEMON("7"),

    APPLE("8"),

    CHERRY("9"),

    WATERMELON("10");


    private String number;

    ProductsEnum(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "ProductsEnum{" +
                "number='" + number + '\'' +
                '}';
    }
}

