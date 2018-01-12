package Cart;

import Car.Car;

import java.util.ArrayList;

public class DeliveryNovaPoshta implements DeliveryStrategy {
    @Override
    public boolean deliver(ArrayList<Car> cars) {
        System.out.println("Your books are delivered ar Nove Poshta department: ");
        for(Car car : cars) {
            System.out.println(car.getSpec().getName());
        }
        return true;
    }
}