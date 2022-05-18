package oop.rent;

public class RentService {

    private EmailService emailService = new EmailService();
    private SmsService smsService = new SmsService();
    private InvoiceService invoiceService = new InvoiceService();

    public void rent(Rentable rentable, int hours) {
        emailService.sentRentConfirmation(rentable);
        smsService.sentRentConfirmation(rentable);
        invoiceService.generateInvoice(rentable, hours);
    }

}
