package basics.rentservice.service;

import basics.rentservice.Rentable;

public class SmsService {
    public void notify(Rentable rentable) {
        System.out.println("SMS: You've rented " + rentable);
    }
}
