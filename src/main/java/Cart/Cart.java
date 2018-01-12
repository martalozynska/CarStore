package Cart;
import Car.Car;
import java.util.ArrayList;

public class Cart {
    ArrayList<Car> cars = new ArrayList<>();
    private PaymentStrategy paymentStrategy;
    private DeliveryStrategy deliveryStrategy;

    public Cart(ArrayList<Car> cars) {
        this.cars = cars;
    }
    public boolean ship() {
        if (paymentStrategy.pay(computeTotalPrice())) {
            deliveryStrategy.deliver(cars);
        }
        return false;
    };

    public double computeTotalPrice() {
        double price = 0;
        for (Car car : cars) {
            price += car.getPrice();
        }
        return price;
    }

    public PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }

    public Cart setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
        return this;
    }

    public DeliveryStrategy getDeliveryStrategy() {
        return deliveryStrategy;
    }

    public Cart setDeliveryStrategy(DeliveryStrategy deliveryStrategy) {
        this.deliveryStrategy = deliveryStrategy;
        return this;
    }
}
