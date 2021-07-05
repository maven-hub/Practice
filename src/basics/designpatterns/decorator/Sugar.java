package basics.designpatterns.decorator;

public class Sugar implements Decorator {
    private Decorator decorator;

    public Sugar(Decorator beverage) {
        this.decorator = beverage;
    }

    @Override
    public String getDescription() {
        return decorator.getDescription() + " Added sugar";
    }

    @Override
    public int getCost() {
        return decorator.getCost() + 2;
    }

    @Override
    public String toString() {
        return "Sugar{" +
                "decorator=" + decorator +
                '}';
    }
}
