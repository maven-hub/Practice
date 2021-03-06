package basics.designpatterns.decorator;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Diversifiable> beverages = new ArrayList<>();

        Diversifiable beverage1 = new Sugar(new Beverage());
        Diversifiable beverage2 = new Sugar(new Milk(new Beverage()));
        Diversifiable beverage3 = new Sugar(new Milk(new Caramel(new Beverage())));

        beverages.add(beverage1);
        beverages.add(beverage2);
        beverages.add(beverage3);

        System.out.println();
        System.out.println(beverages + "\n");

        for (Diversifiable el : beverages) {
            System.out.println(el.getDescription() + " is priced at: " + el.getCost());
            System.out.println();
        }
    }
}
