package oop.podstawy;

public class Car {

    //Pola klasy
    private String brand;
    private String model;
    private int productionYear;

    //Konstruktor bezparametrowy
    public Car() {

    }

    //Konstruktor 3 parametrowy
    public Car(String brand, String model, int productionYear) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
    }

    //Getter - służy do pobrania wartości pola
    public String getBrand() {
        return brand;
    }

    //Setter - służy do ustawienia nowej wartości pola
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public void printDescription() {
        String message = String.format("Samochod marki: %s model: %s rocznik: %d", brand, model, productionYear);
        System.out.println(message);
    }

}
