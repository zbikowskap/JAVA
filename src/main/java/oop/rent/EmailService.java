package oop.rent;

public class EmailService {

    public void sentRentConfirmation(Rentable rentable) {
        System.out.println("[EMAIL] Potwierdzenie wypozyczenia. " + rentable.description());
    }

}
