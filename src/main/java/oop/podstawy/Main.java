package oop.podstawy;

public class Main {

    public static void main(String[] args) {
        //Stworzenie zmiennej i obiektu klasy Car
        Car car = new Car("Opel", "Astra", 2005);

        //Pobranie i wyswietlenie danych za pomoca getterow
        System.out.println(car.getBrand());
        System.out.println(car.getModel());
        System.out.println(car.getProductionYear());

        //Wywolanie settera - zmiana rocznika
        car.setProductionYear(2007);

        //Wywolanie metody klasy Car, ktora wyswietla opis obiektu
        car.printDescription();

        //Stworzenie obiektu bez ustawiania wartosci za pomoca konstruktora domyslnego
        Car emptyCar = new Car();
        emptyCar.printDescription();
    }

}
