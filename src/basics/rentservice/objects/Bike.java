package basics.rentservice.objects;

import basics.rentservice.Rentable;

import java.math.BigDecimal;

public class Bike implements Rentable {
    private String brand;
    private BigDecimal pricePerHour;

    public Bike(String brand, BigDecimal pricePerHour) {
        this.brand = brand;
        this.pricePerHour = pricePerHour;
    }

    @Override
    public String toString() {
        return brand;
    }

    @Override
    public String description() {
        return "Brand: " + brand + "\nCost of renting is: " + pricePerHour + "zł per hour";
    }

    @Override
    public BigDecimal calculatePrice(int hours) {
        return pricePerHour.multiply(BigDecimal.valueOf(hours));
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public BigDecimal getPricePerHour() {
        return pricePerHour;
    }

    @Override
    public void setPricePerHour(BigDecimal pricePerHour) {
        this.pricePerHour = pricePerHour;
    }
}
