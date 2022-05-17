package oop.rent;

public class Main {

    public static void main(String[] args) {
        RentService rentService = new RentService();

        Car car = new Car("Opel", "Astra", 2005);
        rentService.rent(car, 4);

        Scooter scooter = new Scooter("Fast and Furious");
        rentService.rent(scooter, 5);
    }

}
