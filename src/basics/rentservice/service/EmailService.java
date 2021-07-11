package basics.rentservice.service;

import basics.rentservice.Rentable;

public class EmailService {
    public void notify(Rentable rentable) {
        System.out.println("EMAIL: You've rented " + rentable);
    }
}
