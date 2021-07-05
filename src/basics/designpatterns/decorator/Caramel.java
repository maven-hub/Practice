package basics.designpatterns.decorator;

public class Caramel implements Diversifiable {
    private final Diversifiable diversifiable;

    public Caramel(Diversifiable diversifiable) {
        this.diversifiable = diversifiable;
    }

    @Override
    public String getDescription() {
        return diversifiable.getDescription() + " with Caramel";
    }

    @Override
    public int getCost() {
        return diversifiable.getCost() + 6;
    }

    @Override
    public String toString() {
        return "Caramel " + diversifiable;
    }
}
