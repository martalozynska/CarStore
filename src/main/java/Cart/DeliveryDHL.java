package Cart;

import Car.Car;

import java.util.ArrayList;

public class DeliveryDHL implements DeliveryStrategy {

    @Override
    public boolean deliver(ArrayList<Car> cars) {
        System.out.println("Your cars are delivered by DHL: ");
        for (Car car : cars) {
            System.out.println(car.getSpec().getName());
        }
        return true;
    }
}
