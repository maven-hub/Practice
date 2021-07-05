package basics.designpatterns.decorator;

public class Beverage implements Diversifiable {
    @Override
    public String getDescription() {
        return "Beverage";
    }

    @Override
    public int getCost() {
        return 10;
    }

    @Override
    public String toString() {
        return "Beverage";
    }
}
