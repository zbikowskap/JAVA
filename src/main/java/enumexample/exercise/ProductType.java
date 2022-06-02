package enumexample.exercise;

public enum ProductType {

    FRUIT("FRUIT", 1),
    VEGETABLE("VEGETABLE", 2),
    DRINK("DRINK", 3),
    MEAT("MEAT", 4),
    CHEESE("CHEESE", 5);

    private String name;
    private int code;

    ProductType(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }
}
