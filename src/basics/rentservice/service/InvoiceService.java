package basics.rentservice.service;

import basics.rentservice.Rentable;

public class InvoiceService {
    public void generateInvoice(Rentable rentable, int hours) {
        System.out.println("Your invoice for renting " + rentable + " was generated for: " + rentable.calculatePrice(hours) + "zł");
    }
}
