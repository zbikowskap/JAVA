package oop.rent;

public class InvoiceService {

    public void generateInvoice(Rentable rentable, int hours) {
        System.out.println("Generating invoice... price: " + rentable.calculatePrice(hours));
    }

}
