package oop.rent;

public class EmailService {

    public void sentRentConfirmation(Car car) {
        System.out.println("[EMAIL] Potwierdzenie wypozyczenia. " + car.description());
    }

    public void sentRentConfirmation(Scooter scooter) {
        System.out.println("[EMAIL] Potwierdzenie wypozyczenia. " + scooter.description());
    }

}
