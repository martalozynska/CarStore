package Cart;

import Car.Car;

import java.util.ArrayList;

public interface DeliveryStrategy {
    boolean deliver(ArrayList<Car> cars);
}
