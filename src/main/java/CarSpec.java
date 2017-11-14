public class CarSpec {
    private Transmission transmission;
    private State state;
    private Name name;
    private Color color;

    public CarSpec(Transmission transmission, State state, Name name, Color color) {
        this.transmission = transmission;
        this.state = state;
        this.name = name;
        this.color = color;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public State getState() {
        return state;
    }

    public Name getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }
}
