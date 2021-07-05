package basics.designpatterns.decorator;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Decorator> beverages = new ArrayList<>();

        Decorator beverage1 = new Sugar(new Beverage());
        Decorator beverage2 = new Sugar(new Milk(new Beverage()));
        Decorator beverage3 = new Sugar(new Milk(new Caramel(new Beverage())));

        beverages.add(beverage1);
        beverages.add(beverage2);
        beverages.add(beverage3);

        System.out.println(beverages);

        for (Decorator el : beverages) {
            System.out.println(el.getCost());
            System.out.println(el.getDescription());
            System.out.println();
        }
    }
}
