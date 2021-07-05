package basics.designpatterns.decorator;

public class Milk implements Diversifiable {
    private final Diversifiable diversifiable;

    public Milk(Diversifiable diversifiable) {
        this.diversifiable = diversifiable;
    }

    @Override
    public String getDescription() {
        return diversifiable.getDescription() + " with Milk";
    }

    @Override
    public int getCost() {
        return diversifiable.getCost() + 4;
    }

    @Override
    public String toString() {
        return "Milk " + diversifiable;
    }
}
