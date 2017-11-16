public class Car {
    private String id;
    private int price;
    private int year;
    private CarSpec spec;

    public Car(Transmission transmission,
               String id,
               State state,
               Name name,
               Color color,
               int price,
               int year) {
        this.id = id;
        this.price = price;
        this.year = year;
        this.spec = new CarSpec(transmission, state, name, color);
    }



    public int getPrice() {
        return price;
    }

    public CarSpec getSpec() { return spec; }

    public int getYear() {
        return year;
    }

    public String getId() { return id; }

    public int setPrice(int newPrice) {
        this.price = newPrice;
        return price;
    }
}
