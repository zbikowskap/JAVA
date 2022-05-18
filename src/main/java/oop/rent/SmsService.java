package oop.rent;

public class SmsService {

    public void sentRentConfirmation(Rentable rentable) {
        System.out.println("[SMS] Potwierdzenie wypozyczenia. " + rentable.description());
    }

}
