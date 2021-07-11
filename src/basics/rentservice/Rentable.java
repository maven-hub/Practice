package basics.rentservice;

import java.math.BigDecimal;

public interface Rentable {
    String description();

    BigDecimal calculatePrice(int hours);

    String getBrand();

    void setBrand(String brand);

    BigDecimal getPricePerHour();

    void setPricePerHour(BigDecimal pricePerHour);
}
