package basics.designpatterns.decorator;

public class Beverage implements Decorator {
    @Override
    public String getDescription() {
        return "Basic beverage";
    }

    @Override
    public int getCost() {
        return 10;
    }
}
