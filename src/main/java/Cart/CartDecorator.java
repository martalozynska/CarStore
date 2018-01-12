package Cart;

import Car.Car;

import java.util.ArrayList;

public class CartDecorator extends Cart {
    protected Cart cart;

    public CartDecorator(ArrayList<Car> cars) {
        super(cars);
    }

    @Override
    public boolean ship() {
        return super.ship();
    }

    @Override
    public double computeTotalPrice() {
        return super.computeTotalPrice();
    }
}
