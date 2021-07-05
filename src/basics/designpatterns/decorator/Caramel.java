package basics.designpatterns.decorator;

public class Caramel implements Decorator {
    private Decorator decorator;

    public Caramel(Decorator beverage) {
        this.decorator = beverage;
    }

    @Override
    public String getDescription() {
        return decorator.getDescription() + " Added caramel";
    }

    @Override
    public int getCost() {
        return decorator.getCost() + 6;
    }

    @Override
    public String toString() {
        return "Caramel{" +
                "decorator=" + decorator +
                '}';
    }
}
