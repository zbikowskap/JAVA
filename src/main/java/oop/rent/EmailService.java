package oop.rent;

public class EmailService {

    public void sentRentConfirmation(Car car) {
        System.out.println("[EMAIL] Potwierdzenie wypozyczenia. " + car.description());
    }

}
