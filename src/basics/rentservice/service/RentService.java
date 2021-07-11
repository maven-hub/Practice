package basics.rentservice.service;

import basics.rentservice.Rentable;

public class RentService {
    private EmailService emailService;
    private SmsService smsService;
    private InvoiceService invoiceService;

    public RentService() {
        this.emailService = new EmailService();
        this.smsService = new SmsService();
        this.invoiceService = new InvoiceService();
    }

    public void rent(Rentable rentable, int hours) {
        emailService.notify(rentable);
        smsService.notify(rentable);
        invoiceService.generateInvoice(rentable, hours);
    }
}
