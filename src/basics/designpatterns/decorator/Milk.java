package basics.designpatterns.decorator;

public class Milk implements Decorator {
    private Decorator decorator;

    public Milk(Decorator beverage) {
        this.decorator = beverage;
    }

    @Override
    public String getDescription() {
        return decorator.getDescription() + " Added Milk";
    }

    @Override
    public int getCost() {
        return decorator.getCost() + 4;
    }

    @Override
    public String toString() {
        return "Milk{" +
                "decorator=" + decorator +
                '}';
    }
}
