package oop.rent;

public class Main {

    public static void main(String[] args) {
        EmailService emailService = new EmailService();
        SmsService smsService = new SmsService();
        InvoiceService invoiceService = new InvoiceService();

        Car car = new Car("Opel", "Astra", 2005);
        emailService.sentRentConfirmation(car);
        smsService.sentRentConfirmation(car);
        invoiceService.generateInvoice(car, 4);

    }

}
