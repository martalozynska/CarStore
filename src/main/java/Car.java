public class Car {
    private Transmission transmission;
    private State state;
    private String name;
    private String model;
    private String color;
    private int price;
    private int year;

    public Car(Transmission transmission,
               State state,
               String name,
               String model,
               String color,
               int price,
               int year) {
        this.transmission = transmission;
        this.state = state;
        this.name = name;
        this.model = model;
        this.color = color;
        this.price = price;
        this.year = year;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public State getState() {
        return state;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public Car setPrice(int newPrice) {
        this.price = newPrice;
        return this;
    }
}
