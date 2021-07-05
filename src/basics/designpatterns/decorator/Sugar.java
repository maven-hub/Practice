package basics.designpatterns.decorator;

public class Sugar implements Diversifiable {
    private final Diversifiable diversifiable;

    public Sugar(Diversifiable diversifiable) {
        this.diversifiable = diversifiable;
    }

    @Override
    public String getDescription() {
        return diversifiable.getDescription() + " with Sugar";
    }

    @Override
    public int getCost() {
        return diversifiable.getCost() + 2;
    }

    @Override
    public String toString() {
        return "Sugar " + diversifiable;
    }
}
