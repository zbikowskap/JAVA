package oop.rent;

public class InvoiceService {

    public void generateInvoice(Car car, int hours) {
        System.out.println("Generating invoice... price: " + car.calculatePrice(hours));
    }

}
