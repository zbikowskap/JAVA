package oop.rent;

public class RentService {

    private EmailService emailService = new EmailService();
    private SmsService smsService = new SmsService();
    private InvoiceService invoiceService = new InvoiceService();

    public void rent(Car car, int hours) {
        emailService.sentRentConfirmation(car);
        smsService.sentRentConfirmation(car);
        invoiceService.generateInvoice(car, hours);
    }

    public void rent(Scooter scooter, int hours) {
        emailService.sentRentConfirmation(scooter);
        smsService.sentRentConfirmation(scooter);
        invoiceService.generateInvoice(scooter, hours);
    }

}
