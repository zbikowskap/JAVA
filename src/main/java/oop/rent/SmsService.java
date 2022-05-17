package oop.rent;

public class SmsService {

    public void sentRentConfirmation(Car car) {
        System.out.println("[SMS] Potwierdzenie wypozyczenia. " + car.description());
    }

    public void sentRentConfirmation(Scooter scooter) {
        System.out.println("[SMS] Potwierdzenie wypozyczenia. " + scooter.description());
    }

}
