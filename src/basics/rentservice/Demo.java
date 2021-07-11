package basics.rentservice;

import basics.rentservice.service.RentService;
import basics.rentservice.objects.Bike;
import basics.rentservice.objects.Car;
import basics.rentservice.objects.Motorcycle;

import java.math.BigDecimal;

public class Demo {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------");
        RentService rentService = new RentService();
        Rentable bmw = new Car("BMW X3", BigDecimal.valueOf(67.56));
        Rentable ducati = new Motorcycle("Ducati", BigDecimal.valueOf(32.43));
        Rentable shimano = new Bike("Shimano", BigDecimal.valueOf(14.84));

        rentService.rent(bmw, 4);
        System.out.println("--------------------------------------------------------");
        rentService.rent(ducati, 5);
        System.out.println("--------------------------------------------------------");
        rentService.rent(shimano, 7);
    }
}
