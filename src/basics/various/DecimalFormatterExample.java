package basics.various;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DecimalFormatterExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wysokość przychodu:");
        double input = scanner.nextDouble();
        double incomeTax = 0.0;
        DecimalFormat df = new DecimalFormat(".##");
        if (input < 85528.0) {
            incomeTax = (input * 0.18) - 556.02;
        } else {
            incomeTax = 14839.02 + ((input - 85528.0) * 0.32);
        }

        System.out.println("Wysokość twojego podatku dochodowego wynosi: " + df.format(incomeTax) + " zł");
    }
}
